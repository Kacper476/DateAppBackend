package com.example.Dateapp.service;

import com.example.Dateapp.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUser();

    public User getUserByEmail(String Email);

}
