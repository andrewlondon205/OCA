package com.pluralsight.oracle.oca.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchSyntax {

    public static void main(String[] args) {

        String FILE_PATH = "C:\\Users\\AlejandriaRamai\\Desktop\\IT\\Learning\\java\\OCA\\exceptions\\src\\com\\pluralsight\\oracle\\oca\\exceptions\\basic_try_demo.txt";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(FILE_PATH));

            //read line by line
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.format("FileNotFoundException: %s%n",e);
        } catch (IOException e) {
            System.err.format("IOException: %s%n",e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
