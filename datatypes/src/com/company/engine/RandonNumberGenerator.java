package com.company.engine;

class RandonNumberGenerator {

    public int getNumberToGuess () {
        return (int) ((Math.random() * 10) + 1);
    }

}
