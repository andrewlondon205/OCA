package com.pluralsight.oracle.oca.arrays.tictactoe;

import java.util.Scanner;

/**
 * Human player. Asks the user to enter the move to make.
 */
public class HumanPlayer implements Player {

    private final Symbol symbol;

    public HumanPlayer(Symbol symbol) {
        this.symbol = symbol;
    }

    @Override
    public Symbol getSymbol() {
        return symbol;
    }

    @Override
    public Position getMove(Game game) {
        System.out.print("Where do you want to place your " + symbol + "? [1-9]: ");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input;
            while (true) {
                String line = scanner.nextLine();
                if (line.length() == 1) {
                    char c = line.charAt(0);
                    if (c >= '1' && c <= '9') {
                        input = c - '1';
                        break;
                    }
                }

                System.out.print("Please enter a number between 1 and 9: ");
            }

            Position position = new Position(input / 3, input % 3);
            if (game.isOccupied(position)) {
                System.out.print("That position is already occupied, please try again: ");
            } else {
                return position;
            }
        }
    }
}
