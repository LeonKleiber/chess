package data;

import logic.Position;

public class Queen extends ChessPiece {

    public Queen(boolean playerOne){
        super("Queen", playerOne);

    }

    @Override
    public Position[] getMovementOptions(Position position) {
        return new Position[0];
    }
}
