/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.client.Barber;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import views.loginComponents.LoginFormSubPanel;

/**
 *
 * @author User
 */
public class Barberpanel extends JPanel {
    
    private JPanel northSubPanel;
    private JPanel middleSubPanel;
    private JPanel southSubPanel;
    
    
    
    public Barberpanel(){
        
        this.setLayout(new BorderLayout());
        this.northSubPanel = new JPanel();
        this.middleSubPanel = new BarberFormSubPanel();
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
