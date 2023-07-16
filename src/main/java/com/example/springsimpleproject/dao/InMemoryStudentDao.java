package com.example.springsimpleproject.dao;

import com.example.springsimpleproject.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {
    private final List<Student> STUDENTS=new ArrayList<>();

    public Student save(Student student){
        STUDENTS.add(student);
        return student;
    }

    public List<Student> getAllStudents(){
        return STUDENTS;
    }

    public Student getByEmail(String email){
        return STUDENTS.stream()
                .filter(student -> email.equals(student.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public Student update(Student student){
        var studentIndex= IntStream.range(0,STUDENTS.size())
                .filter(index->STUDENTS.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex>-1){
            STUDENTS.set(studentIndex,student);
            return student;
        }
        return null;
    }

    public void delete(String email){
        var student=getByEmail(email);
        if (student!=null){
            STUDENTS.remove(student);
        }
    }
}
