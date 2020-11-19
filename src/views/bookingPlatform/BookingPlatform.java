/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.bookingPlatform;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookingPlatform extends JPanel {

    private JPanel northPanel;
    private JPanel midlePanel;
    private JPanel serachPanel;
    private JPanel searchButton;
    private JTextField searchTextfield;
    private JPanel viewBookingButtonPanel;
 

    public BookingPlatform() {

        this.northPanel = new JPanel();
        this.midlePanel = new JPanel();
        serachPanel = new JPanel();
        searchButton = new JPanel();
        searchTextfield = new JTextField(10);
        viewBookingButtonPanel = new JPanel();
   
        
        midlePanel.setLayout(new GridLayout(2, 1));
        JLabel searchLabel = new JLabel("Search");

        northPanel.setLayout(new GridLayout(1, 1));

        serachPanel.add(searchLabel);
        serachPanel.add(searchTextfield);
        northPanel.add(serachPanel);
        midlePanel.add(new JLabel());
        midlePanel.add(new JLabel());
        midlePanel.add(new JLabel());        
        midlePanel.add(viewBookingButtonPanel);        
        JButton searchButton = new JButton("Search");
        this.serachPanel.add(searchButton);
        JButton viewBookingButton = new JButton("View Your Booking");
        this.viewBookingButtonPanel.add(viewBookingButton);

        this.add(northPanel, BorderLayout.NORTH);
        this.add(midlePanel, BorderLayout.CENTER);

    }

}
