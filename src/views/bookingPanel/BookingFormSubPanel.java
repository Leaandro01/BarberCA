/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.bookingPanel;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class BookingFormSubPanel extends JPanel {
    
     private JPanel buttonPanel;
     
    
    
    public BookingFormSubPanel(){
    
    this.buttonPanel = new JPanel ();
   
    
    JButton viewBookingbutton = new JButton("View your booking");
        this.buttonPanel.add(viewBookingbutton);
    
    this.setLayout(new GridLayout(5, 1));
    
    
      
        this.add(this.buttonPanel);
    
    }
    
}
