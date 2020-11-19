
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.bookingPanelComponents;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class SlotesArea extends JPanel {
    
    private String[] dates;
    
    public SlotesArea(String[] dates) {
        
        this.dates = dates;
        
        this.setLayout(new GridLayout(this.dates.length, 1));
        for (String date : dates) {
            
            JPanel slotPanel = new JPanel();
            JLabel dateLabel = new JLabel(date);
            JButton button = new JButton("Book now");
            
            slotPanel.add(dateLabel);
            slotPanel.add(button);
            
            this.add(slotPanel);
            
        }
        
    }
    
}