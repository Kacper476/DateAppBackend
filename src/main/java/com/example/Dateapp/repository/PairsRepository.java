package com.example.Dateapp.repository;

import com.example.Dateapp.model.Pairs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface PairsRepository extends JpaRepository<Pairs,Integer> {


}