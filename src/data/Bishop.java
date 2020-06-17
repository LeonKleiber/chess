package data;

import dto.Position;

import java.util.ArrayList;

public class Bishop extends ChessPiece {

    public Bishop(boolean playerOne){
        super("Bishop", playerOne);

    }

    @Override
    public ArrayList<ArrayList<Position>> getMovementOptions(Position position) {
        ArrayList<ArrayList<Position>> positions = new ArrayList<ArrayList<Position>>();
        ArrayList<Position> fl = new ArrayList<Position>();
        ArrayList<Position> fr = new ArrayList<Position>();
        ArrayList<Position> bl = new ArrayList<Position>();
        ArrayList<Position> br = new ArrayList<Position>();
        int y = position.y;
            for (int i = position.x; i < 7; i++) {
                if(y < 7 && y >= 0) {
                    fl.add(new Position(i + 1, y + 1));
                    System.out.println("A " + (i + 1) + " und " + (y + 1));
                    y++;
                }
            }

            y = position.y;
            for(int i = position.x; i > 0; i--){
                if(y < 7 && y >= 0) {
                    fr.add(new Position(i - 1, y + 1));
                    System.out.println("B " + (i - 1) + " und " + (y + 1));
                    y++;
                }
            }

                y = position.y;
            for (int i = position.x; i < 7; i++) {
                if(y <= 7 && y > 0) {
                    bl.add(new Position(i + 1, y - 1));
                    System.out.println("C "+ (i + 1) + " und " + (y - 1));
                    y--;
                }
            }

                y = position.y;
            for(int i = position.x; i > 0; i--){
                if(y <= 7 && y > 0) {
                    br.add(new Position(i - 1, y - 1));
                    System.out.println("D "+ (i - 1) + " und " + (y - 1));
                    y--;
                }
            }
            positions.add(fl);
            positions.add(fr);
            positions.add(bl);
            positions.add(br);
        return positions;
        }

    }
