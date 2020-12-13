package views.loginsComponents;

import javax.swing.*;
import java.awt.*;

public class LoginFormSubPanel extends JPanel {


    private JPanel emailPanel;
    private JPanel passwordPanel;
    private JPanel buttonsPanel;
    private JButton signupButton;
    private JButton signinButton;
    private JTextField emailTextField;
    private JPasswordField passwordField;

    /**
     * I'm not leaving it public because only LoginPanel will be the client of this class therefore they are in the same package.
     */
    public LoginFormSubPanel(){
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
 /**
     * Getter for the sign button
     */
    public JButton getSigninButton(){
        return signinButton;
    }
 /**
     * taking the information from email for my database
     */
    public String getEmail(){
        return emailTextField.getText();
    }
    //taking the information from password for my database
    public String getPassword(){
        return new String(passwordField.getPassword());
    }

}




