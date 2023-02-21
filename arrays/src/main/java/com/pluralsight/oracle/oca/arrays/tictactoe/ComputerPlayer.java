package com.pluralsight.oracle.oca.arrays.tictactoe;

/**
 * Computer player. This uses the Minimax algorithm to find the best move.
 */
public class ComputerPlayer implements Player {

    private final Symbol symbol;

    public ComputerPlayer(Symbol symbol) {
        this.symbol = symbol;
    }

    @Override
    public Symbol getSymbol() {
        return symbol;
    }

    @Override
    public Position getMove(Game game) {
        System.out.println("Computer's turn");

        int bestScore = -10;
        Position bestPosition = new Position(-1, -1);

        // Find the best move from all possibilities.
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                Position position = new Position(row, column);
                if (!game.isOccupied(position)) {
                    // Create a copy of the game with this move applied.
                    Game newGame = game.copy().makeMove(position, symbol);

                    // Apply the minimax algorithm to find the score of this move.
                    int score = minimax(newGame, false, 0);

                    // Keep track of the best score and move.
                    if (score > bestScore) {
                        bestScore = score;
                        bestPosition = position;
                    }
                }
            }
        }

        return bestPosition;
    }

    // Minimax algorithm. See https://en.wikipedia.org/wiki/Minimax
    private int minimax(Game game, boolean maximize, int depth) {
        int score;
        if (game.isGameOver()) {
            if (game.isWinner(symbol)) {
                // We win, score is 10 points minus the current depth.
                // The depth is subtracted because the fewer moves it takes to win, the better (the higher the score).
                score = 10 - depth;
            } else if (game.isWinner(symbol.opponent())) {
                // The opponent wins, score is minus 10 points plus the current depth.
                // The depth is added because if the opponent wins with fewer moves, that's worse.
                score = -10 + depth;
            } else {
                // The game is over but it's a draw.
                score = 0;
            }
        } else {
            if (maximize) {
                // Our turn; find the move with the highest score.
                score = Integer.MIN_VALUE;
                for (int row = 0; row < 3; row++) {
                    for (int column = 0; column < 3; column++) {
                        Position position = new Position(row, column);
                        if (!game.isOccupied(position)) {
                            // Create a copy of the game with this move applied.
                            Game newGame = game.copy().makeMove(position, symbol);

                            // Think ahead by calling minimax() recursively to find the best next move for the opponent.
                            score = Math.max(score, minimax(newGame, false, depth + 1));
                        }
                    }
                }
            } else {
                // The opponent's turn; find the move with the lowest score (the opponent wants us to lose).
                score = Integer.MAX_VALUE;
                for (int row = 0; row < 3; row++) {
                    for (int column = 0; column < 3; column++) {
                        Position position = new Position(row, column);
                        if (!game.isOccupied(position)) {
                            // Create a copy of the game with this move applied.
                            Game newGame = game.copy().makeMove(position, symbol.opponent());

                            // Think ahead by calling minimax() recursively to find the best next move for us.
                            score = Math.min(score, minimax(newGame, true, depth + 1));
                        }
                    }
                }
            }
        }

        return score;
    }
}
