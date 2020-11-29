/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.loginComponents;

import java.awt.GridLayout;
import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class LoginFormSubPanel extends JPanel{
    
  
    private JPanel emailPanel;
    private JPanel passwordPanel;
    private JPanel buttonsPanel;
    private JButton signupButton;
    private JButton signinButton;
    private JTextField emailTextField;
    private JPasswordField passwordField;
    
    
    /**
     * I'm not leaving it public because only LoginPanel will be the the client.
     */
    LoginFormSubPanel(){
        
         // Initialize the variables
        emailPanel = new JPanel();
        passwordPanel = new JPanel();
        buttonsPanel = new JPanel();



        // Assigning a grid layout to emailPanel and npassword Panel
        emailPanel.setLayout(new GridLayout(1,2));
        passwordPanel.setLayout(new GridLayout(1,2));


        // initializing labels and textfield for the emailPanel
        JLabel emailLabel = new JLabel("Email");
        emailTextField = new JTextField(10);

        emailPanel.add(emailLabel);
        emailPanel.add(emailTextField);

        // initializing labels and textfield for the password Panel
        JLabel passwordLabel = new JLabel("Password");
        passwordField = new JPasswordField(10);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        // initializing labels and textfield for the emailPanel
        signinButton = new JButton("Signin");
        this.signupButton = new JButton("Signup");
        this.buttonsPanel.add(signinButton);
        this.buttonsPanel.add(signupButton);

        // Setting upp GridLayout Manager
        this.setLayout(new GridLayout(9, 1));

        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(this.emailPanel);
        this.add(this.passwordPanel);
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(this.buttonsPanel);
        this.add(new JLabel());
    }

    /**
     * Getter for the signup button
     */
    public JButton getSignupButton(){
        return signupButton;
    }

    public JButton getSigninButton(){
        return signinButton;
    }

    public String getEmail(){
        return emailTextField.getText();
    }

    public String getPassword(){
        return new String(passwordField.getPassword());
    }

}