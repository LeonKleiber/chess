package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndScreen extends JDialog {
    public EndScreen(Gui gui, String title, String message) {
        super(gui, title);
        JPanel messagePane = new JPanel();
        messagePane.add(new JLabel(message));
        getContentPane().add(messagePane);
        setLocationRelativeTo(gui);

        JPanel buttonPane = new JPanel();
        JButton button = new JButton("End Game");
        buttonPane.add(button);

        button.addActionListener(new MyActionListener(gui));
        getContentPane().add(buttonPane, BorderLayout.PAGE_END);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);

    }

    private class MyActionListener implements ActionListener {
        Gui gui;

        MyActionListener(Gui gui){
            this.gui = gui;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            gui.close();
            dispose();
        }
    }
}
