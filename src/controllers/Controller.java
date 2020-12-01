package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import models.entities.User;
import models.operations.DatabaseOperation;
import models.operations.UserDatabaseOperation;
import views.Frame;
import views.loginComponents.LoginPanel;
import views.signupComponents.SignupPanel;

/**
 *
 * @author User
 */
public class Controller implements ActionListener {

    private final LoginPanel loginPanel;
    private final SignupPanel signupPanel;

    public Controller() {

        loginPanel = new LoginPanel();
        signupPanel = new SignupPanel();

      
        assignListenerToSignupButton();
        assignListerouserTyepeComboBox();
         assignListenerToSigninButton();
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
  
   
    public void assignListenerToSignupButton(){
        JButton signupButton = loginPanel.getSignupButton();

        signupButton.addActionListener(this);
        signupButton.setActionCommand("signupTrigger");
    }
     public void assignListenerToSigninButton(){
        JButton signinButton = loginPanel.getSigninButton();

        signinButton.addActionListener(this);
        signinButton.setActionCommand("signinTrigger");
    }

    public void launchSignupWindow() {
        new Frame(500, 700, signupPanel);
    }

    public void switchLocationState() {
        signupPanel.changeLocation();

    }

    public void login() {
        System.out.println("Logging in..");
        // Write code here.
        String email = loginPanel.getEmail();
        String password = loginPanel.getPassword();

        User user = new User(null, null, email, null, password, null);

        DatabaseOperation<User> userDatabaseOperation = new UserDatabaseOperation();
        User selectedUser = userDatabaseOperation.select(user);

        if (selectedUser == null) {
            // Fail
            JOptionPane.showMessageDialog(loginPanel, "User with this email or password doesn't exist");
        } else {
            // Succcess
            JOptionPane.showMessageDialog(loginPanel, "User successfully logged in. :)");
        }

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getActionCommand().equals("signupTrigger")) {
            launchSignupWindow();

        } else if (actionEvent.getActionCommand().equals("locationTrigger")) {
            switchLocationState();

        }if(actionEvent.getActionCommand().equals("signinTrigger")){
            login();
        }
    }

}
