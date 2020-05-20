package data;

import javax.swing.text.Position;

public class Pawn extends ChessPiece {

    public Pawn(boolean playerOne){
        super("Pawn", playerOne);

    }

    @Override
    public Position[] movementOption(Position position) {
        return new Position[0];
    }
}
