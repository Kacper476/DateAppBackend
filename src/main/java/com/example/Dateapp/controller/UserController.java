package com.example.Dateapp.controller;

import com.example.Dateapp.model.User;
import com.example.Dateapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<User> list(){
        return userService.getAllUser();
    }

    @GetMapping("/getByEmail/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }






}