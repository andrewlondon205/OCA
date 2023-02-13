package com.company.engine;

public class GuessMyNumber {

    private int numberOfTries;
    private int numberOfTriesPlayed = 0;
    private int numberToGuess = 0;

    public GuessMyNumber (int numberOfTries) {

        if(numberOfTries < 1 || numberOfTries > 10) {
            throw new IllegalArgumentException ("Unfair number of tries selected! \n Choose a value between 1 and 10.");
        }

        this.numberOfTries = numberOfTries;

        RandonNumberGenerator randomNumber = new RandonNumberGenerator();
        setNumberToGuess(randomNumber.getNumberToGuess());

    }

    public void play () {


    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public void setNumberToGuess(int numberToGuess) {
        this.numberToGuess = numberToGuess;
    }
}
