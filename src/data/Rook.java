package data;

import javax.swing.text.Position;

public class Rook extends ChessPiece {

    public Rook(boolean playerOne){
        super("Rook", playerOne);

    }

    @Override
    public Position[] movementOption(Position position) {
        return new Position[0];
    }
}
