package gui;

import dto.Position;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ChessField extends JButton {

    Position position;

    ChessField (Position p , Color c, Icon i){
        setBackground(c);
        setOpaque(true);
        setIcon(i);
        setBorder(new EmptyBorder(0,0,0,0));
        this.position = p;
    }


    public Position getPosition() {
        return position;
    }
}
