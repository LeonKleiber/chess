package data;

import javax.swing.text.Position;

public class Queen extends ChessPiece {

    public Queen(boolean playerOne){
        super("Queen", playerOne);

    }

    @Override
    public Position[] movementOption(Position position) {
        return new Position[0];
    }
}
