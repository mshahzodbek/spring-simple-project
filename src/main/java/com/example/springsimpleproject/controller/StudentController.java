package com.example.springsimpleproject.controller;

import com.example.springsimpleproject.model.Student;
import com.example.springsimpleproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getALlStudents(){
        return studentService.getALlStudents();
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/{email}")
    public Student getStudentByEmail(@PathVariable("email") String email){
        return studentService.getByEmail(email);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return studentService.update(student);
    }

    @DeleteMapping("/{email}")
    public void deleteStudent(String email){
        studentService.delete(email);
    }

}
