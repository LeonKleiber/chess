package data;

import dto.Position;

import java.util.ArrayList;

public class Knight extends ChessPiece {

    public Knight(boolean playerOne){
        super("Knight", playerOne);

    }

    @Override
    public ArrayList<ArrayList<Position>> getMovementOptions(Position position) {
        return null;
    }
}
