package com.pluralsight.oracle.oca.arrays.tictactoe;

public class Game {

    private final Symbol[][] grid = new Symbol[3][3];

    public boolean isGameOver() {
        // The game is over when one of the players has won.
        if (isWinner(Symbol.CROSS) || isWinner(Symbol.NAUGHT)) return true;

        // Otherwise, the game is over if there are no open positions left.
        for (Symbol[] row : grid) {
            for (Symbol field : row) {
                // Found an open position; it's not yet game over.
                if (field == null) return false;
            }
        }

        // No open positions, it's game over with a draw.
        return true;
    }

    public boolean isWinner(Symbol symbol) {
        for (int i = 0; i < 3; i++) {
            // Check if the i'th row makes this symbol win
            if (grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) return true;

            // Check if the i'th column makes this symbol win
            if (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol) return true;
        }

        // Check the diagonal from top left to bottom right
        if (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) return true;

        // Check the diagonal from top right to bottom left
        if (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol) return true;

        return false;
    }

    public boolean isOccupied(Position position) {
        return grid[position.getRow()][position.getColumn()] != null;
    }

    public Game makeMove(Position position, Symbol symbol) {
        // You cannot put a symbol in a position that already has a symbol.
        if (isOccupied(position)) {
            throw new IllegalArgumentException("Position " + position + " is already occupied");
        }

        grid[position.getRow()][position.getColumn()] = symbol;

        return this;
    }

    public Game copy() {
        Game copy = new Game();
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                copy.grid[row][column] = this.grid[row][column];
            }
        }
        return copy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Symbol[] row : grid) {
            for (Symbol field : row) {
                sb.append(field != null ? field : ".").append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
