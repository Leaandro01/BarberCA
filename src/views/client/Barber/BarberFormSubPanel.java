/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.client.Barber;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class BarberFormSubPanel extends JPanel {

    private JPanel emailPanel;
    private JPanel fullNamePanel;
    private JPanel phonePanel;
    private JPanel passwordPanel;
    private JPanel buttonPanel;
    private JPanel locationPanel;

    public BarberFormSubPanel() {
        String[] name = {"barber", "client"};
        JComboBox comboBox = new JComboBox(name);

        this.emailPanel = new JPanel();
        this.passwordPanel = new JPanel();
        this.fullNamePanel = new JPanel();
        this.phonePanel = new JPanel();
        this.locationPanel = new JPanel();
        this.buttonPanel = new JPanel();

        JTextField emailBarberTextField = new JTextField(10);
        JLabel emailBarberLabel = new JLabel("Email");
        this.emailPanel.add(emailBarberLabel);
        this.emailPanel.add(emailBarberTextField);

        JTextField nameBarberTextField = new JTextField(10);
        JLabel nameBarberLabel = new JLabel("Full name");
        this.fullNamePanel.add(nameBarberLabel);
        this.fullNamePanel.add(nameBarberTextField);

        JTextField phoneBarberTextField = new JTextField(10);
        JLabel phonelBarberLabel = new JLabel("Phone");
        this.phonePanel.add(phonelBarberLabel);
        this.phonePanel.add(phoneBarberTextField);

        JTextField passwordBarberTextField = new JTextField(10);
        JLabel passwordBarberLabel = new JLabel("Passowrd");
        this.passwordPanel.add(passwordBarberLabel);
        this.passwordPanel.add(passwordBarberTextField);

        JTextField locationBarberTextField = new JTextField(10);
        JLabel locationBarberLabel = new JLabel("Localization");
        this.locationPanel.add(locationBarberLabel);
        this.locationPanel.add(locationBarberTextField);

        JButton signinButton = new JButton("Signin");
        this.buttonPanel.add(signinButton);

        this.setLayout(new GridLayout(13, 1));
        this.add(new JLabel());

        this.add(comboBox);
       this.add(new JLabel());
        this.add(this.emailPanel);
         this.add(new JLabel());
        this.add(this.fullNamePanel);
         this.add(new JLabel());
        this.add(this.phonePanel);
         this.add(new JLabel());
        this.add(this.locationPanel);
         this.add(new JLabel());
        this.add(this.passwordPanel);
        this.add(this.buttonPanel);
      
    }
}
