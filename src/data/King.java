package data;

import javax.swing.text.Position;

public class King extends ChessPiece {

    public King(boolean playerOne){
        super("King", playerOne);

    }

    @Override
    public Position[] getMovementOptions(Position position) {
        return new Position[0];
    }
}
