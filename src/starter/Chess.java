package starter;

import data.*;

public class Chess {
    public static void main(String[] args) {
        new Queen(true);
        new Rook(false);
        new King(true);
        new Bishop(false);
        new Knight(true);
        new Pawn(false);
    }
}
