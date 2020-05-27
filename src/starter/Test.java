package starter;

import data.*;


public class Test {
    public static void main(String[] args) {
        ChessPiece q = new Queen(true);
        ChessPiece r = new Rook(false);
        ChessPiece ki= new King(true);
        ChessPiece b = new Bishop(false);
        ChessPiece kn = new Knight(true);
        ChessPiece p =new Pawn(false);
    }
}
