package views;


import javax.swing.*;

/**
 * This class is only for opening the window.
 */
public class Frame extends JFrame {


    public Frame(int width, int height, JPanel panel) {

        this.setSize(width, height);
        this.setVisible(true);
        // @TODO: Later on perhaps bring this action to an ActionListener
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel);

        this.repaint();
        this.validate();
    }

    public Frame(int width, int height, JPanel panel, Boolean makeItVisible) {

        this.setSize(width, height);
        this.setVisible(makeItVisible);
        // @TODO: Later on perhaps bring this action to an ActionListener
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(panel);

        this.repaint();
        this.validate();

    }
}



