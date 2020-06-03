package data;

import dto.Position;

public class Queen extends ChessPiece {

    public Queen(boolean playerOne){
        super("Queen", playerOne);

    }

    @Override
    public Position[] getMovementOptions(Position position) {
        return new Position[0];
    }
}
