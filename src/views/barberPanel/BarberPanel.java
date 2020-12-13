/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.barberPanel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BarberPanel extends JPanel {

    private JPanel northSubPanel;
    private BaberPlatformSubPanel middleSubPanel;
    private JPanel southSubPanel;
    
    public BarberPanel (){
    
    
      this.setLayout(new BorderLayout());
        this.northSubPanel = new JPanel();
        this.middleSubPanel = new BaberPlatformSubPanel();
        this.southSubPanel = new JPanel();
    
    
        this.add(this.northSubPanel, BorderLayout.NORTH);
        this.add(this.middleSubPanel, BorderLayout.CENTER);
        this.add(this.southSubPanel, BorderLayout.SOUTH);
        
        JLabel northSubPanelLabel = new JLabel("Barber Register");       
        JLabel southSubPanelLabel = new JLabel ("Almicar CA");
        
        
        this.northSubPanel.add(northSubPanelLabel);
        this.southSubPanel.add(southSubPanelLabel);
        
        
        
        

    }
    // getter For the button from BaberPlatformSubPanel
    public JButton getSlotesButton() {

        return middleSubPanel.getSlotesTable();

    }
}
