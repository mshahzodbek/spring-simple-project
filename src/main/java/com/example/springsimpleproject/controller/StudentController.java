package com.example.springsimpleproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @GetMapping
    public List<String> getStudents(){
        return List.of(
                "Jeyms Bond",
                "Tom Kruz"
        );
    }
}
