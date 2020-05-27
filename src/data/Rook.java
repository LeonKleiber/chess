package data;

import javax.swing.text.Position;

public class Rook extends ChessPiece {

    public Rook(boolean playerOne){
        super("Rook", playerOne);

    }

    @Override
    public Position[] getMovementOptions(Position position) {
        return new Position[0];
    }
}
