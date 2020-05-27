package data;

import javax.swing.text.Position;

public class Knight extends ChessPiece {

    public Knight(boolean playerOne){
        super("Knight", playerOne);

    }

    @Override
    public Position[] getMovementOptions(Position position) {
        return new Position[0];
    }
}
