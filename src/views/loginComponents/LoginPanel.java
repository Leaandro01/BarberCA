
package views.loginComponents;

import controllers.Controller;
import java.awt.BorderLayout;
import static java.awt.SystemColor.text;
import java.text.Normalizer.Form;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JButton;

import javax.swing.JButton;

import javax.swing.JButton;

import javax.swing.JButton;

/**
 *
 * @author User
 */
public class LoginPanel  extends JPanel{       
    
    private JPanel northSubPanel;
    private LoginFormSubPanel middleSubPanel;
    private JPanel southSubPanel;
    public LoginPanel(){
        
        this.setLayout(new BorderLayout());
        this.northSubPanel = new JPanel();
        this.middleSubPanel = new LoginFormSubPanel();
        this.southSubPanel = new JPanel();
    
        this.add(this.northSubPanel, BorderLayout.NORTH);
        this.add(this.middleSubPanel, BorderLayout.CENTER);
        this.add(this.southSubPanel, BorderLayout.SOUTH);
        
        JLabel northSubPanelLabel = new JLabel("Barber Login");       
        JLabel southSubPanelLabel = new JLabel ("Almicar CA");
        
        
        this.northSubPanel.add(northSubPanelLabel);
        this.southSubPanel.add(southSubPanelLabel);
        
        
    }
    
    public JButton getSingupButton(){
    
    return this.middleSubPanel.getSingupButton();
    
    }

    public JButton getSingupButton(Controller aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}