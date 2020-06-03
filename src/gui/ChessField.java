package gui;

import dto.Position;

import javax.swing.*;
import java.awt.*;

public class ChessField extends JButton {

    Position position;

    ChessField (int x, int y , Color color){
        setBackground(color);
        setOpaque(true);
        this.position = new Position(x,y);
    }
}
