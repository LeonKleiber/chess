package data;

import logic.Position;

public class Pawn extends ChessPiece {

    public Pawn(boolean playerOne){
        super("Pawn", playerOne);

    }

    @Override
    public Position[] getMovementOptions(Position position) {
        return new Position[0];
    }
}
