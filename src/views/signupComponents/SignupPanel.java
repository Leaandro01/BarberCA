package views.signupComponents;

import javax.swing.*;
import java.awt.*;

public class SignupPanel extends JPanel {


    private JPanel headersPanel;
    private JPanel middlePanel;
    private JPanel southPanel;
    private JPanel emailPanel;
    private JPanel phonePanel;
    private JPanel passwordPanel;
    private JPanel locationPanel;
    private JPanel userTypePanel;
    private JPanel fullNamePanel;
    private JComboBox<String> userTypeComboBox;
    private JTextField emailTextField;
    private JTextField phoneTextField;
    private JPasswordField passwordTextField;
    private JTextField locationTextField;
    private JTextField fullNameTextField;

    private JButton signup;
    private JButton backToLogin;


    public SignupPanel(){

        signup = new JButton( "Register");
        backToLogin = new JButton( "Back");
        southPanel = new JPanel();
        fullNamePanel= new JPanel();

        fullNameTextField = new JTextField();
        headersPanel = new JPanel();
        middlePanel = new JPanel();
        emailPanel = new JPanel();
        locationPanel = new JPanel();
        userTypePanel = new JPanel();
        phonePanel = new JPanel();
        passwordPanel = new JPanel();
        phoneTextField = new JTextField();
        passwordTextField = new JPasswordField();



        emailPanel.setLayout(new GridLayout(1,2));
        locationPanel.setLayout(new GridLayout(1,2));
        userTypePanel.setLayout(new GridLayout(1,2));
        locationPanel.setVisible(false);


        userTypeComboBox = new JComboBox(new String[]{"customer", "service provider"});

        emailTextField = new JTextField();
        locationTextField = new JTextField();

        JLabel emailLabel = new JLabel("Email");
        JLabel userTypeLabel = new JLabel("User Type");
        JLabel locationLabel = new JLabel("Location");

        emailPanel.add(emailLabel);
        emailPanel.add(emailTextField);

        locationPanel.add(locationLabel);
        locationPanel.add(locationTextField);

        userTypePanel.add(userTypeLabel);
        userTypePanel.add(userTypeComboBox);

        middlePanel.add(userTypePanel);
        middlePanel.add(new JLabel());
        middlePanel.add(new JLabel());
        middlePanel.add(new JLabel());
        middlePanel.add(emailPanel);
        middlePanel.add(fullNamePanel);

        fullNamePanel.add(new JLabel("Full Name"));
        fullNamePanel.add(fullNameTextField);


        fullNamePanel.setLayout( new GridLayout(1,2));
        phonePanel.setLayout(new GridLayout(1,2));
        passwordPanel.setLayout(new GridLayout(1,2));


        phonePanel.add(new JLabel("Phone Number"));
        phonePanel.add(phoneTextField);
        passwordPanel.add(new JLabel("Password"));
        passwordPanel.add(passwordTextField);

        middlePanel.add(passwordPanel);
        middlePanel.add(phonePanel);
        middlePanel.add(locationPanel);



        middlePanel.setLayout(new GridLayout(10, 1));

        southPanel.add(new JLabel());
        southPanel.add(backToLogin);
        southPanel.add( new JLabel());
        southPanel.add(signup);
        southPanel.add(new JLabel());

        southPanel.setLayout(new GridLayout(1,5));



        this.setLayout(new BorderLayout());
        this.add(headersPanel, BorderLayout.NORTH);
        this.add(middlePanel, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);

        JLabel signupLabel = new JLabel("Signup page");
        headersPanel.add(signupLabel);

    }

    public void changeLocationState(){
        String selectedUserType = userTypeComboBox.getItemAt(userTypeComboBox.getSelectedIndex()); // customer - service provider
        if(selectedUserType.equals("customer")){
            locationPanel.setVisible(false);
        }else{
            locationPanel.setVisible(true);
        }
    }


    public JComboBox<String> getUserTypeComboBox(){
        return userTypeComboBox;
    }

    public String getUserType() {
        return (String) userTypeComboBox.getSelectedItem();
    }

    public String getFullName() {
        return fullNameTextField.getText();
    }

    public String getEmail() {
        return emailTextField.getText();
    }

    public String getPhone() {
        return phoneTextField.getText();
    }

    public String getPassword() {
        return new  String(passwordTextField.getPassword());
    }

    public String getLocationText() {
        return locationTextField.getText();
    }

    public JButton getSignup() {
        return signup;
    }

    public JButton getBackToLogin() {
        return backToLogin;
    }
}
