package com.pluralsight.oracle.oca.arrays.tictactoe;

public enum Symbol {
    CROSS("X"),
    NAUGHT("O");

    private final String character;

    Symbol(String character) {
        this.character = character;
    }

    public static Symbol fromCharacter(char c) {
        switch (c) {
            case 'X':
                return CROSS;
            case 'O':
                return NAUGHT;
            default:
                throw new IllegalArgumentException("Invalid symbol character: " + c);
        }
    }

    public Symbol opponent() {
        return this == CROSS ? NAUGHT : CROSS;
    }

    @Override
    public String toString() {
        return character;
    }
}
