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
    
    
    
    /**
     * I'm not leaving it public because only LoginPanel will be the the client.
     */
    LoginFormSubPanel(){
        
        this.emailPanel = new JPanel();
        this.passwordPanel = new JPanel();
        this.buttonsPanel = new JPanel();
        
        this.emailPanel.setLayout(new GridLayout(1, 2));
        this.passwordPanel.setLayout(new GridLayout(1,2));
        
        // initialinig labels and textfield for the emailPanel
        JTextField emailTextField = new JTextField(10);
        JLabel emailLabel = new JLabel("Email");
        this.emailPanel.add(emailLabel);
        this.emailPanel.add(emailTextField);
        
        JTextField passwordField = new JPasswordField(10);
        JLabel passwordLabel = new JLabel("Password");
        this.passwordPanel.add(passwordLabel);
        this.passwordPanel.add(passwordField);
        
        this.signupButton = new JButton ("Signin");
        this.signinButton = new JButton ("Signup");
        this.buttonsPanel.add(signinButton);
        this.buttonsPanel.add(signupButton);
        
        //settin
        
        this.setLayout(new GridLayout(9,1));
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
    
    //Getter for signup button
    
   public JButton getSingupButton(){
    
    return signupButton;
    
    }
}
