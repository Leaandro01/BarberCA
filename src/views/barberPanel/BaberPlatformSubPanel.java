/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.barberPanel;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class BaberPlatformSubPanel extends JPanel {

    
    private JPanel buttonbarberPlatPanel;
    private JPanel buttonbarberPlatPanel2;
    private JButton slotsTable;
   
    public BaberPlatformSubPanel() {

            
        this.buttonbarberPlatPanel = new JPanel();
        this.buttonbarberPlatPanel2 = new JPanel();
        // getting a for lopp to get my text with space and columns
        String originalText = "Welcome to see your costumer click in the button below";
        String[] originalTextArray = originalText.split(" ");
        String textToChange = "";

        for (int i = 0; i < originalTextArray.length; i++) {
            textToChange += originalTextArray[i] + " ";

            if (i % 5 == 0) {
                textToChange += "<br>";
            }
        }
        JLabel welcomingText = new JLabel("<html><body>" + textToChange + "</body></html");
        this.add(welcomingText);
        this.add(this.buttonbarberPlatPanel);

        String originalText2 = "Hi, to add your information click in Slots Tables";
        String[] originalTextArray2 = originalText2.split(" ");
        String textToChange2 = "";

        for (int i = 0; i < originalTextArray2.length; i++) {
            textToChange2 += originalTextArray2[i] + " ";

            if (i % 5 == 0) {
                textToChange2 += "<br>";
            }
        }
        JLabel welcomingText2 = new JLabel("<html><body>" + textToChange2 + "</body></html");
        this.add(welcomingText2);
        this.add(this.buttonbarberPlatPanel2);

        
        
        JButton viewCostumer = new JButton("View yours costumers");
        this.buttonbarberPlatPanel.add(viewCostumer);

        JButton slotsTable = new JButton("Slots Tables");
        this.buttonbarberPlatPanel2.add(slotsTable);
        this.setLayout(new GridLayout(2, 1));

        this.add(this.buttonbarberPlatPanel);
        this.add(this.buttonbarberPlatPanel2);
    }
    //getter for the slotstable but i could not finish
    public JButton getSlotesTable() {

        return this.slotsTable;

    }
    
}
