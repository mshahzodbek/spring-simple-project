package com.example.springsimpleproject.service;

import com.example.springsimpleproject.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {
    Student save(Student student);
    List<Student> getALlStudents();
    Student getByEmail(String email);
    Student update(Student student);
    void delete(String email);
}
