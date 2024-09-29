package com.buildlive.guesstheword.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService {

    private String[] randomWords = {"father","mother","sister,string","hello","light"};

    Random random = new Random();

    @Override
    public String toString() {
        return randomWords[random.nextInt(randomWords.length)];
    }
}
