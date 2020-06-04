package logic;

import data.*;
import dto.Position;

public class Board {

    Field [][] fields = new Field[8][8];

    public Board(){
        Field field;
        for (int y = 0; y < fields.length; y++){
            for(int x = 0; x < fields[y].length; x++){
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
                        System.out.println("empty"+x+y);
                        break;
                }
                fields[y][x] = field;

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

    public Field getField(Position position) {
        return fields[position.y][position.x];
    }
}
