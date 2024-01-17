package com.example.Dateapp.service;

import com.example.Dateapp.model.Pairs;
import com.example.Dateapp.repository.PairsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PairsServiceImpl implements PairsService {

    @Autowired
    private PairsRepository PairsRepository;

    @Override
    public Pairs savePairs(Pairs Pairs) {
        return PairsRepository.save(Pairs);
    }

    @Override
    public List<Pairs> getAllUser() {
        return PairsRepository.findAll();
    }

    @Override
        public List<Pairs> getPairs(int pair1) {

            List<Pairs> matchingPairs = findMatchingPairs(pair1);

            return removePairsWithUser1(matchingPairs,pair1);
        }

        private List<Pairs> findMatchingPairs(int pair1) {
            List<Pairs> allPairs = PairsRepository.findAll();
            List<Pairs> matchingPairs = new ArrayList<>();

            for (Pairs pairs : allPairs) {
                if (pairs.getUser1() == pair1 || pairs.getUser2() == pair1) {
                    matchingPairs.add(pairs);
                }
            }

            return matchingPairs;
        }

    private List<Pairs> removePairsWithUser1(List<Pairs> matchingPairs, int pair1) {
        List<Pairs> filteredPairs = new ArrayList<>();

        for (Pairs pairs : matchingPairs) {
            if (pairs.getUser1() != pair1) {
                filteredPairs.add(pairs);
            }
        }

        return filteredPairs;
    }

}