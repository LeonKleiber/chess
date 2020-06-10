package logic;

import data.ChessPiece;
import data.Pawn;
import dto.Position;

import javax.swing.*;
import java.util.ArrayList;

public class Field {
    ChessPiece chessPiece;
    Position position;

    public Field(Position position){
        this.position = position;
        chessPiece = null;
    }

    public Field(Position position, ChessPiece chessPiece){
        this.position = position;
        this.chessPiece = chessPiece;
    }

    public ArrayList<ArrayList<Position>> getMovementOptions(Board b){
        if (chessPiece != null){
            ArrayList<ArrayList<Position>> positions;
            if (!(chessPiece instanceof Pawn)){
                positions = getPieceMovement(b);
            } else {
                positions = getPawnMovement(b);
            }
            return positions;
        }
        return null;
    }

    private ArrayList<ArrayList<Position>> getPawnMovement(Board b) {
        ArrayList<ArrayList<Position>> positionArray;
        positionArray = chessPiece.getMovementOptions(position);
        positionArray.set(0, getMoveOptions(b, positionArray.get(0)));
        positionArray.set(1, getKillOptions(b, positionArray.get(1)));
        return positionArray;
    }

    private ArrayList<Position> getKillOptions(Board b, ArrayList<Position> positions) {
        ArrayList<Position> newKillOptions = new ArrayList<>();
        for(Position position: positions ){
            Field checkField = b.getField(position);
            if(checkField.getChessPiece() != null && checkField.getChessPiece().isPlayerOne() != chessPiece.isPlayerOne()){
                newKillOptions.add(position);
            }
        }
        return newKillOptions;
    }

    private ArrayList<Position> getMoveOptions(Board b, ArrayList<Position> positions) {
        ArrayList<Position> newMoveOptions = new ArrayList<>();
        for(Position position: positions ){
            if (b.getField(position).getChessPiece()== null){
                newMoveOptions.add(position);
            }
            else {
                break;
            }
        }
        return newMoveOptions;
    }

    private ArrayList<ArrayList<Position>> getPieceMovement(Board b) {
        ArrayList<ArrayList<Position>> positionArray;
        positionArray = chessPiece.getMovementOptions(position);
        for(int i = 0; i<positionArray.size();i++){
            positionArray.set(i, getOptions(b, positionArray.get(i)));
        }
        return positionArray;
    }

    private ArrayList<Position> getOptions(Board b, ArrayList<Position> positions) {
        ArrayList<Position> newMoveOptions = new ArrayList<>();
        for(Position position: positions ){
            Field checkField = b.getField(position);
            if(checkField.getChessPiece() == null){
                newMoveOptions.add(position);
            } else {
                if (checkField.getChessPiece().isPlayerOne() != chessPiece.isPlayerOne()){
                    newMoveOptions.add(position);
                }
                break;
            }
        }
        for(Position p : newMoveOptions){
            System.out.println(p.x + ","+p.y);
        }
        return newMoveOptions;
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