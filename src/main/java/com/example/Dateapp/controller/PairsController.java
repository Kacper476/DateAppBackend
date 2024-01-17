package com.example.Dateapp.controller;

import com.example.Dateapp.model.Pairs;
import com.example.Dateapp.service.PairsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pairs")
@CrossOrigin
public class PairsController {
    @Autowired
    private PairsService PairsService;

    @PostMapping("/add")
    public String add(@RequestBody Pairs user){
        PairsService.savePairs(user);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Pairs> list(){
        return PairsService.getAllUser();
    }

    @GetMapping("/getPair")
    public List<Pairs> pairs(){

        int pair1=1;

        return PairsService.getPairs(pair1);
    }







}