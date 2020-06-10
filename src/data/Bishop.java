package data;

import dto.Position;

import java.util.ArrayList;

public class Bishop extends ChessPiece {

    public Bishop(boolean playerOne){
        super("Bishop", playerOne);

    }

    @Override
    public ArrayList<ArrayList<Position>> getMovementOptions(Position position) {
        ArrayList<ArrayList<Position>> positions = new ArrayList<ArrayList<Position>>();
        return positions;
    }

}
