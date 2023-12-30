package com.example.Dateapp.controller;

import com.example.Dateapp.model.User;
import com.example.Dateapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class UserController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody User student){
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<User> list(){
        return studentService.getAllStudents();
    }
}