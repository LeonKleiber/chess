package data;

import dto.Position;

public class Rook extends ChessPiece {

    public Rook(boolean playerOne){
        super("Rook", playerOne);

    }

    @Override
    public Position[] getMovementOptions(Position position) {
        position.x = 4;
        return new Position[0];
    }
}
