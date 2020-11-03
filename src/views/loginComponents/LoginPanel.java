/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.loginComponents;

import java.awt.BorderLayout;
import static java.awt.SystemColor.text;
import java.text.Normalizer.Form;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class LoginPanel  extends JPanel{       
    
    private JPanel northSubPanel;
    private JPanel middleSubPanel;
    private JPanel southSubPanel;
    public LoginPanel(){
        
        this.setLayout(new BorderLayout());
        this.northSubPanel = new JPanel();
        this.middleSubPanel = new LoginFormSubPanel();
        this.southSubPanel = new JPanel();
    
        this.add(this.northSubPanel, BorderLayout.NORTH);
        this.add(this.middleSubPanel, BorderLayout.CENTER);
        this.add(this.southSubPanel, BorderLayout.SOUTH);
        
        JLabel northSubPanelLabel = new JLabel("Login");       
        JLabel southSubPanelLabel = new JLabel ("Almicar CA");
        
        
        this.northSubPanel.add(northSubPanelLabel);
        this.southSubPanel.add(southSubPanelLabel);
        
        
    }
    
    
    
}
