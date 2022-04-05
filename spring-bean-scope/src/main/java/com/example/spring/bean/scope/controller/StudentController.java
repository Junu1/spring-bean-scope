package com.example.spring.bean.scope.controller;

import com.example.spring.bean.scope.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public String registerStudent(@RequestParam String name, @RequestParam String address) {
        studentService.registerStudent(name, address);
        return "Student registered successfully";
    }
}
