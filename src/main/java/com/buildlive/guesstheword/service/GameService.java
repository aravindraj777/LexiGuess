package com.buildlive.guesstheword.service;

import java.util.Random;

public class GameService {

    private String[] randomWords = {"father","mother","sister,string","hello","light"};

    Random random = new Random();

    @Override
    public String toString() {
        return randomWords[random.nextInt(randomWords.length)];
    }
}
