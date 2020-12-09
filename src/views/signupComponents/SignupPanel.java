
package views.signupComponents;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignupPanel extends JPanel {
    private JPanel headersPanel = new JPanel();
    private JPanel middlePanel = new JPanel();
    private JPanel southPanel = new JPanel();
    private JPanel emailPanel = new JPanel();
    private JPanel phonePanel = new JPanel();
    private JPanel passwordPanel = new JPanel();
    private JPanel locationPanel = new JPanel();
    private JPanel userTypePanel = new JPanel();
    private JPanel fullNamePanel = new JPanel();
    private JComboBox<String> userTypeComboBox;
    private JTextField emailTextField;
    private JTextField phoneTextField = new JTextField();
    private JPasswordField passwordTextField = new JPasswordField();
    private JTextField locationTextField;
    private JTextField fullNameTextField = new JTextField();
    private JButton signup = new JButton("Register");
    private JButton backToLogin = new JButton("Back");

    public SignupPanel() {
        this.emailPanel.setLayout(new GridLayout(1, 2));
        this.locationPanel.setLayout(new GridLayout(1, 2));
        this.userTypePanel.setLayout(new GridLayout(1, 2));
        this.locationPanel.setVisible(false);
        this.userTypeComboBox = new JComboBox(new String[]{"customer", "service provider"});
        this.emailTextField = new JTextField();
        this.locationTextField = new JTextField();
        JLabel emailLabel = new JLabel("Email");
        JLabel userTypeLabel = new JLabel("User Type");
        JLabel locationLabel = new JLabel("Location");
        this.emailPanel.add(emailLabel);
        this.emailPanel.add(this.emailTextField);
        this.locationPanel.add(locationLabel);
        this.locationPanel.add(this.locationTextField);
        this.userTypePanel.add(userTypeLabel);
        this.userTypePanel.add(this.userTypeComboBox);
        this.middlePanel.add(this.userTypePanel);
        this.middlePanel.add(new JLabel());
        this.middlePanel.add(new JLabel());
        this.middlePanel.add(new JLabel());
        this.middlePanel.add(this.emailPanel);
        this.middlePanel.add(this.fullNamePanel);
        this.fullNamePanel.add(new JLabel("Full Name"));
        this.fullNamePanel.add(this.fullNameTextField);
        this.fullNamePanel.setLayout(new GridLayout(1, 2));
        this.phonePanel.setLayout(new GridLayout(1, 2));
        this.passwordPanel.setLayout(new GridLayout(1, 2));
        this.phonePanel.add(new JLabel("Phone Number"));
        this.phonePanel.add(this.phoneTextField);
        this.passwordPanel.add(new JLabel("Password"));
        this.passwordPanel.add(this.passwordTextField);
        this.middlePanel.add(this.passwordPanel);
        this.middlePanel.add(this.phonePanel);
        this.middlePanel.add(this.locationPanel);
        this.middlePanel.setLayout(new GridLayout(10, 1));
        this.southPanel.add(new JLabel());
        this.southPanel.add(this.backToLogin);
        this.southPanel.add(new JLabel());
        this.southPanel.add(this.signup);
        this.southPanel.add(new JLabel());
        this.southPanel.setLayout(new GridLayout(1, 5));
        this.setLayout(new BorderLayout());
        this.add(this.headersPanel, "North");
        this.add(this.middlePanel, "Center");
        this.add(this.southPanel, "South");
        JLabel signupLabel = new JLabel("Signup page");
        this.headersPanel.add(signupLabel);
    }

    public void changeLocationState() {
        String selectedUserType = (String)this.userTypeComboBox.getItemAt(this.userTypeComboBox.getSelectedIndex());
        if (selectedUserType.equals("customer")) {
            this.locationPanel.setVisible(false);
        } else {
            this.locationPanel.setVisible(true);
        }

    }

    public JComboBox<String> getUserTypeComboBox() {
        return this.userTypeComboBox;
    }

    public String getUserType() {
        return (String)this.userTypeComboBox.getSelectedItem();
    }

    public String getFullName() {
        return this.fullNameTextField.getText();
    }

    public String getEmail() {
        return this.emailTextField.getText();
    }

    public String getPhone() {
        return this.phoneTextField.getText();
    }

    public String getPassword() {
        return new String(this.passwordTextField.getPassword());
    }

    public String getLocationText() {
        return this.locationTextField.getText();
    }

    public JButton getSignup() {
        return this.signup;
    }
}
