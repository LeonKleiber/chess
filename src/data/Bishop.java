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
                fl.add(new Position(i + 1, y + 1));
                System.out.println((i + 1) + " und " + (y + 1));
                y++;
            }
            y = position.y;
            for(int i = position.x; i > 0; i--){
                fr.add(new Position(i - 1, y - 1));
                System.out.println((i - 1) +" und "+ (y + 1));
                y++;
            }

                y = position.x;
            for (int i = position.y; i < 7; i++) {
                bl.add(new Position(y + 1, i + 1));
                System.out.println((y + 1) + " und " + (i + 1));
                y++;
            }

                y = position.x;
            for(int i = position.y; i > 0; i--){
                br.add(new Position((y -1), i - 1));
                System.out.println(position.x + " und " + (i - 1));
                y++;
            }
            positions.add(fl);
            positions.add(fr);
            positions.add(bl);
            positions.add(br);
        return positions;
        }

    }
