package com.example.Dateapp.service;

import com.example.Dateapp.model.User;
import com.example.Dateapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private UserRepository studentRepository;

    @Override
    public User saveStudent(User student) {
        return studentRepository.save(student);
    }

    @Override
    public List<User> getAllStudents() {
        return studentRepository.findAll();
    }
}