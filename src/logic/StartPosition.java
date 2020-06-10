package logic;

import data.*;
import dto.Position;

public class StartPosition {

    Field [][] startPosition = new Field[8][8];

    public StartPosition(){

        Field field;
        ChessPiece rook = new Rook(true);
        for (int y = 0; y < startPosition.length; y++){
            for(int x = 0; x < startPosition[y].length; x++){
                switch (y){
                    case 0:
                        field = new Field(new Position(x,y),getChessPiece(true, x));
                        break;
                    case 7:
                        field = new Field(new Position(x,y),getChessPiece(false, x));
                        break;
                    case 1:
                        field = new Field(new Position(x,y), new Pawn(true));
                        break;
                    case 6:
                        field = new Field(new Position(x,y), new Pawn(false));
                        break;
                    default:
                        field = new Field(new Position(x,y));
                        break;
                }
                startPosition[y][x] = field;

            }
        }
    }

    private ChessPiece getChessPiece(boolean playerOne, int x) {
        switch (x){
            case 0:
            case 7:
                return new Rook(playerOne);
            case 1:
            case 6:
                return new Knight(playerOne);
            case 2:
            case 5:
                return new Bishop(playerOne);
            case 3:
                return new Queen(playerOne);
            default:
                return new King(playerOne);
        }
    }

    public Field[][] getFields(){
        return startPosition;
    }
}
