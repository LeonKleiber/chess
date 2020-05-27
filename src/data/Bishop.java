package data;

import javax.swing.text.Position;

public class Bishop extends ChessPiece {

    public Bishop(boolean playerOne){
        super("Bishop", playerOne);

    }

    @Override
    public Position[] getMovementOptions(Position position) {
        return new Position[0];
    }
}
