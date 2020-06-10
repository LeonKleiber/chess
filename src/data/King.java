package data;

import dto.Position;

import java.util.ArrayList;

public class King extends ChessPiece {

    public King(boolean playerOne){
        super("King", playerOne);

    }

    @Override
    public ArrayList<ArrayList<Position>> getMovementOptions(Position position) {
        return null;
    }
}
