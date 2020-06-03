package data;

import dto.Position;

public class Rook extends ChessPiece {

    public Rook(boolean playerOne){
        super("Rook", playerOne);

    }

    @Override
    public Position[] getMovementOptions(Position position) {
        Position[] positions = new Position[14];
        for (int i = 1; i < 8; i++) {
            if(position.x + i < 9) {
                positions[i - 1] = new Position(position.x + i, position.y);
            }else if(position.x - i >= 0){
                positions[i - 1] = new Position(position.x - i, position.y);
            }
            System.out.println(positions[i - 1].x + " und " + positions[i - 1].y);
        }
        for (int i = 1; i < 8; i++){
            if(position.y + i < 9) {
                positions[i - 1] = new Position(position.x, position.y + i);
            }else if(position.y - i >= 0){
                positions[i - 1] = new Position(position.x, position.y - 1);
            }
            System.out.println(positions[i - 1].x + " und " + positions[i - 1].y);
        }
        return positions;
    }
}