package logic;

import data.ChessPiece;

public class Field {
    ChessPiece chessPiece;
    Position position;

    public Field(Position position){
        this.position = position;
        chessPiece = null;
    }

    public Field(Position position, ChessPiece chessPiece){
        this.position = position;
        this.chessPiece = chessPiece;
    }

    public Position[] getMovementOptions(Position position){
        if (chessPiece != null){
            return chessPiece.getMovementOptions(position);
        }
        return null;
    }

    public void moveAway(){
        chessPiece = null;
    }

    public void moveHere(ChessPiece chessPiece){
        this.chessPiece = chessPiece;
    }
}