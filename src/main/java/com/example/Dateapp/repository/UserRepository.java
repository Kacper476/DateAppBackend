package com.example.Dateapp.repository;

import com.example.Dateapp.model.User;
import jakarta.servlet.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByEmail(String Email);
}