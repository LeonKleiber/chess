package data;

import dto.Position;

import java.util.ArrayList;

public class Queen extends ChessPiece {

    public Queen(boolean playerOne){
        super("Queen", playerOne);

    }

    @Override
    public ArrayList<ArrayList<Position>> getMovementOptions(Position position) {
        return null;
    }
}
