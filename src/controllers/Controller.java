package controllers;

import models.entities.Barber;
import models.entities.Customer;
import models.entities.User;
import models.operations.DatabaseOperation;
import models.operations.UserDatabaseOperation;
import views.Frame;
import views.bookingPanelComponents.BookingPanel;
import views.signupComponents.SignupPanel;
import views.loginsComponents.LoginPanel;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private final LoginPanel loginPanel;
    private final SignupPanel signupPanel;
    private final Frame signupFrame;
    private final Frame loginFrame;
    private final Frame bookingsFrame;
    private final BookingPanel bookingsPanel;
    private User loggedInUser;


    public Controller() {
        loginPanel = new LoginPanel();
        signupPanel = new SignupPanel();
        signupFrame = new Frame(500, 400, signupPanel, false);
        loginFrame = new Frame(400, 400, loginPanel);
        bookingsPanel = new BookingPanel();
        bookingsFrame = new Frame (500, 700, bookingsPanel, false);



        assignListenerToSignupButton();
        assignListenerToSigninButton();
        assignListenerToUserTypeComboBox();
        assignListenerToBackToLoginButton();

    }

    private void assignListenerToBackToLoginButton() {
        JButton backToLogin = signupPanel.getBackToLogin();
        backToLogin.addActionListener(this);
        backToLogin.setActionCommand("backToLogin");
    }

    public void assignListenerToUserTypeComboBox() {

        JComboBox<String> signupComboBox = signupPanel.getUserTypeComboBox();
        signupComboBox.addActionListener(this);
        signupComboBox.setActionCommand("locationTrigger");

    }

    public void assignListenerToSignupButton() {
        JButton signupButtonFromLoginPanel = loginPanel.getSignupButton();
        signupButtonFromLoginPanel.addActionListener(this);
        signupButtonFromLoginPanel.setActionCommand("signupTrigger");

        JButton signupButtonFromSignupPanel = signupPanel.getSignup();
        signupButtonFromSignupPanel.addActionListener(this);
        signupButtonFromSignupPanel.setActionCommand("register");

    }

    public void assignListenerToSigninButton() {
        JButton signinButton = loginPanel.getSigninButton();
        signinButton.addActionListener(this);
        signinButton.setActionCommand("signinTrigger");
    }


    public void launchSignupWindow() {
        this.signupFrame.setVisible(true);
        this.loginFrame.setVisible(false);
    }

    public void switchLocationState() {
        signupPanel.changeLocationState();
    }

    public void login() {
        System.out.println("Logging in..");
        // Write code here.
        String email = loginPanel.getEmail();
        String password = loginPanel.getPassword();

        User user = new User(null, null, email, null, password, null);

        DatabaseOperation<User> userDatabaseOperation = new UserDatabaseOperation();
        loggedInUser = userDatabaseOperation.select(user);

        if (loggedInUser == null) {
            // Fail
            JOptionPane.showMessageDialog(loginPanel, "User with this email or password doesn't exist");
        } else {
            // Succcess
            JOptionPane.showMessageDialog(loginPanel, "User successfully logged in. :)");
            this.bookingsFrame.setVisible(true);
            this.loginFrame.setVisible(false);
            this.signupFrame.setVisible(false);
            populateBookingsPanel();
        }


    }

    private void populateBookingsPanel() {
        bookingsPanel.setUserName(loggedInUser.getFullName());
    }

    private void register() {
        System.out.println("registering");
        String email = signupPanel.getEmail();
        String password = signupPanel.getPassword();
        String phone = signupPanel.getPhone();
        String userType = signupPanel.getUserType();
        String location = signupPanel.getLocationText();
        String fullName = signupPanel.getFullName();


        User user;
if (userType.equals("customer")) {
            user = new Customer(0, fullName, email, phone, password, null);
        } else {
            user = new Barber(0, fullName, email, phone, password, null, location);

        }
        DatabaseOperation<User> userDatabaseOperation = new UserDatabaseOperation();

        if (userDatabaseOperation.insert(user)) {
            JOptionPane.showMessageDialog(signupPanel, "User successfully registered");

            this.signupFrame.setVisible(false);
            this.loginFrame.setVisible(true);
            this.bookingsFrame.setVisible(false);


        } else {
            JOptionPane.showMessageDialog(signupPanel, "Failed to register the user ");
        }


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {


        if (actionEvent.getActionCommand().equals("signupTrigger")) {
            launchSignupWindow();
        } else if (actionEvent.getActionCommand().equals("locationTrigger")) {
            switchLocationState();
        } else if (actionEvent.getActionCommand().equals("signinTrigger")) {
            login();
        } else if (actionEvent.getActionCommand().equals("register")) {
            register();
        } else if (actionEvent.getActionCommand().equals("backToLogin")) {
            backTologin();
        } else {

        }
    }

    private void backTologin() {
        this.signupFrame.setVisible(false);
        this.loginFrame.setVisible(true);
        }
    }