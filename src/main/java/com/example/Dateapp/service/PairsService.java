package com.example.Dateapp.service;

import com.example.Dateapp.model.Pairs;

import java.util.List;

public interface PairsService {
    public Pairs savePairs(Pairs Pairs);
    public List<Pairs> getAllUser();

    public List<Pairs> getPairs(int pair1);

}
