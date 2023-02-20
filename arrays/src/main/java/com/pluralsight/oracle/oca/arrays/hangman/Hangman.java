package com.pluralsight.oracle.oca.arrays.hangman;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) throws IOException {

        System.out.println("Hangman!");

        Noose noose = new Noose();
        String s = getRandomWord();
        Word word = new Word(s);

        Scanner scanner = new Scanner(System.in);
        while(!noose.isComplete() && !word.isGuessed()) {
            System.out.println();

            System.out.println(noose);
            System.out.println();

            System.out.println(word);
            System.out.println();

            System.out.print("Enter a letter to guess: ");
            char c = scanner.nextLine().charAt(0);

            if(word.guessLetter(c)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
                noose.advance();
            }
        }

        System.out.println(noose);
        System.out.println();

        System.out.println(word);
        System.out.println();

        if(noose.isComplete()){
            System.out.println("You lose! The word was: " + s);
        } else {
            System.out.println("You win!");
        }

    }

    private static String getRandomWord() throws IOException {

        List<String> lines = Files.readAllLines(FileSystems.getDefault().getPath("arrays/src/main/java/com/pluralsight/oracle/oca/arrays/hangman/randomwords.txt"));
        return lines.get(new Random().nextInt(lines.size()));
    }
}
