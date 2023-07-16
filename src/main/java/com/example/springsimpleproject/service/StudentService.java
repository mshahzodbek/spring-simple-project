package com.example.springsimpleproject.service;

import com.example.springsimpleproject.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getALlStudents(){
        return List.of(
                new Student("Shahzodbek","Mirzaahmedov", LocalDate.now(),"mshahzodbek0903@gmail.com",20),
                new Student("Jasurbek","Rahimov",LocalDate.now(),"rahimov@gmail.com",25)
        );
    }
}
