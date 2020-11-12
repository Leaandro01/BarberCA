/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.barberPanel;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import views.bookingPanel.BookingFormSubPanel;

/**
 *
 * @author User
 */
public class BarberPlatform extends JPanel{
    private JPanel northSubPanel;
    private JPanel middleSubPanel;
    private JPanel southSubPanel;
    
    public BarberPlatform (){
    
    
      this.setLayout(new BorderLayout());
        this.northSubPanel = new JPanel();
        this.middleSubPanel = new BarberPlatformFromSubPanel();
        this.southSubPanel = new JPanel();
    
    
        this.add(this.northSubPanel, BorderLayout.NORTH);
        this.add(this.middleSubPanel, BorderLayout.CENTER);
        this.add(this.southSubPanel, BorderLayout.SOUTH);
        
        JLabel northSubPanelLabel = new JLabel("Barber Register");       
        JLabel southSubPanelLabel = new JLabel ("Almicar CA");
        
        
        this.northSubPanel.add(northSubPanelLabel);
        this.southSubPanel.add(southSubPanelLabel);
        
    
    
    
    
    }
    
}
