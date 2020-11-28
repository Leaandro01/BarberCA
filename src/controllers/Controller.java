
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import views.Frame;
import views.loginComponents.LoginPanel;
import views.signupComponents.SignupPanel;

/**
 *
 * @author User
 */
public class Controller implements ActionListener {

    private LoginPanel loginPanel;
    private final SignupPanel signupPanel;

    public Controller() {

        loginPanel = new LoginPanel();
        signupPanel = new SignupPanel();

        assignListerToSignupButton();
        assignListerouserTyepeComboBox();
        runFrame(loginPanel);

        //  loginPanel.getSingupButton();
    }

    public void assignListerouserTyepeComboBox() {

        JComboBox<String> signupComboBox = signupPanel.getUserTypeBox();
        signupComboBox.addActionListener(this);
        signupComboBox.setActionCommand("locationTrigger");

    }

    public void runFrame(JPanel panel) {

        new Frame(400, 600, panel);
    }

    public void assignListerToSignupButton() {

        JButton signupButton = loginPanel.getSingupButton();
        signupButton.setActionCommand("signupTrigger");
        signupButton.addActionListener(this);
    }

    public void launchSignupWindow() {
        new Frame(500, 700, signupPanel);
    }
public void  switchLocationState(){
    signupPanel.changeLocation();


}
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getActionCommand().equals("signupTrigger")) {
            launchSignupWindow();

        } else if (actionEvent.getActionCommand().equals("locationTrigger")) {
            switchLocationState();
            
        } if else {
        }
    }

}