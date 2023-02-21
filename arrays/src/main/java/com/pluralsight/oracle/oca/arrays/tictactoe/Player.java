package com.pluralsight.oracle.oca.arrays.tictactoe;

public interface Player {

    Symbol getSymbol();

    Position getMove(Game game);
}
