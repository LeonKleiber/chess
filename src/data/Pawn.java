package data;

import dto.Position;

import java.util.ArrayList;

public class Pawn extends ChessPiece {

    public Pawn(boolean playerOne){
        super("Pawn", playerOne);

    }

    @Override
    public ArrayList<ArrayList<Position>> getMovementOptions(Position position) {
        return null;
    }
}
