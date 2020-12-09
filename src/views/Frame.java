package views;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {

    public Frame(int width, int height, JPanel panel) {
        this.setSize(width, height);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.setContentPane(panel);
        this.repaint();
        this.validate();
    }
}
