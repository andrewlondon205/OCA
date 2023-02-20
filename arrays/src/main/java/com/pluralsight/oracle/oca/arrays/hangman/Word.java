package com.pluralsight.oracle.oca.arrays.hangman;

import java.util.Locale;

public class Word {

    private final char [] letters;
    private final boolean [] guessed;

    public Word(String s) {
        String word = s.toUpperCase();
        int wordLength = word.length();

        letters = new char[wordLength];
        guessed = new boolean[wordLength];

        for (int i=0; i < wordLength; i++) {
            letters[i] = word.charAt(i);
        }
    }

    public boolean guessLetter(char c) {
        char letter = Character.toUpperCase(c);
        boolean correct = false;

        for(int i=0; i < letters.length ; i++) {
            if (letters[i] == letter) {
                correct = true;
                guessed[i] = true;
            }
        }
        return correct;
    }

    public boolean isGuessed() {
        for (boolean element : guessed) {
            if (!element) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            sb.append(guessed[i] ? letters[i] : '_');
        }
        return sb.toString() ;
    }


}
