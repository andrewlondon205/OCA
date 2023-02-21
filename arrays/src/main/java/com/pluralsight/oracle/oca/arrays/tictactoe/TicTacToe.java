package com.pluralsight.oracle.oca.arrays.tictactoe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        // Ask the user if they want to play X or O.
        char input = '?';
        Scanner scanner = new Scanner(System.in);
        while (input != 'X' && input != 'O') {
            System.out.print("Do you want to play X or O? ");
            String line = scanner.nextLine();
            if (line.length() > 0) {
                input = Character.toUpperCase(line.charAt(0));
            }
        }

        // Determine what the computer plays.
        Symbol humanSymbol = Symbol.fromCharacter(input);
        Symbol computerSymbol = humanSymbol.opponent();
        System.out.println("The computer plays " + computerSymbol);

        // Create the two player objects.
        Player humanPlayer = new HumanPlayer(humanSymbol);
        Player computerPlayer = new ComputerPlayer(computerSymbol);

        // Use an array to keep track of which player's turn it is.
        Player[] players;
        if (humanSymbol == Symbol.CROSS) {
            players = new Player[]{humanPlayer, computerPlayer};
        } else {
            players = new Player[]{computerPlayer, humanPlayer};
        }

        // The main loop; iterate as long as the game is not over.
        Game game = new Game();
        while (!game.isGameOver()) {
            System.out.println();
            System.out.println(game);

            // Ask the current player for their next move and perform it.
            Player currentPlayer = players[0];
            Position position = currentPlayer.getMove(game);
            game.makeMove(position, currentPlayer.getSymbol());

            // Swap players for the next turn.
            players[0] = players[1];
            players[1] = currentPlayer;
        }

        System.out.println();
        System.out.println(game);

        // Print the outcome.
        if (game.isWinner(humanSymbol)) {
            System.out.println("Congratulations, you won!");
        } else if (game.isWinner(computerSymbol)) {
            System.out.println("Sorry, the computer won and you lost!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
