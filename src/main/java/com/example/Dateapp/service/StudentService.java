package com.example.Dateapp.service;

import com.example.Dateapp.model.User;

import java.util.List;

public interface StudentService {
    public User saveStudent(User student);
    public List<User> getAllStudents();
}
