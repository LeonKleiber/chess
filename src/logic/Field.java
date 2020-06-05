package logic;

import data.ChessPiece;
import dto.Position;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

public class Field {
    private ChessPiece chessPiece;
    private Position position;

    public Field(Position position){
        this.position = position;
        chessPiece = null;
    }

    public Field(Position position, ChessPiece chessPiece){
        this.position = position;
        this.chessPiece = chessPiece;
    }

    public ArrayList<ArrayList<Position>> getMovementOptions(){
        Position p1 = new Position(7,0);
        Position p2 = new Position(0,0);
        Position p3 = new Position(7,7);
        Position p4 = new Position(0,7);
        Position p5 = new Position(4,4);
        Position p6 = new Position(5,5);
        ArrayList<Position> a1 = new ArrayList<>(2);
        a1.add(p1);
        a1.add(p2);
        ArrayList<Position> a2 = new ArrayList<>(4);
        a1.add(p3);
        a1.add(p4);
        a1.add(p5);
        a1.add(p6);
        ArrayList<ArrayList<Position>> otterArrayList = new ArrayList<>(2);
        otterArrayList.add(a1);
        otterArrayList.add(a2);

        return otterArrayList;
    }

    public void moveAway(){
        chessPiece = null;
    }

    public void moveHere(ChessPiece chessPiece){
        this.chessPiece = chessPiece;
    }

    public ImageIcon getImage() {
        if (chessPiece != null){
            return chessPiece.getImage();
        }
        return null;

    }

    public Position getPosition() {
        return position;
    }

    public ChessPiece getChessPiece() {
        return chessPiece;
    }
}
