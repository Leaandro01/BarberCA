
package views.signupComponents;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class SignupPanel extends JPanel {

   private JPanel headerPanel;
    private JPanel midlePanel;
    private JPanel emailPanel;
    private JPanel fullNamePanel;
    private JPanel phonePanel;
    private JPanel passwordPanel;
    private JPanel locationPanel;
    private JPanel userTypePanel;
    private JPanel registerButtonPanel;
    private JComboBox<String> userTypeComboBox;
    private JTextField emailTextFiled;
    private JTextField localTextFiled;
    private JTextField fullNameTextFiled;
    private JTextField phoneTextFiled;
    private JTextField passwordTextField;
    private JButton registerButton;

    public SignupPanel() {

        this.headerPanel = new JPanel();
        this.midlePanel = new JPanel();

        locationPanel = new JPanel();
        midlePanel = new JPanel();
        headerPanel = new JPanel();
        registerButtonPanel = new JPanel();
        emailPanel = new JPanel();
        fullNamePanel = new JPanel();
        phonePanel = new JPanel();
        passwordPanel = new JPanel();
        userTypePanel = new JPanel();
        emailTextFiled = new JTextField(10);
        localTextFiled = new JTextField(10);
        fullNameTextFiled = new JTextField(10);
        phoneTextFiled = new JTextField(10);
        passwordTextField = new JTextField(10);

        emailPanel.setLayout(new GridLayout(1, 2));
        locationPanel.setLayout(new GridLayout(1, 2));
        userTypePanel.setLayout(new GridLayout(1, 2));
        fullNamePanel.setLayout(new GridLayout(1, 2));
        phonePanel.setLayout(new GridLayout(1, 2));
        passwordPanel.setLayout(new GridLayout(1, 2));

        userTypeComboBox = new JComboBox(new String[]{"costumer", "service provaid"});
        locationPanel.setVisible(false);
        JLabel emalLabel = new JLabel("Email");
        JLabel userTypeLabel = new JLabel("User Type");
        JLabel localtionLabel = new JLabel("Location");
        JLabel phoneLabel = new JLabel("Phone");
        JLabel fullNameLabel = new JLabel("Full Name");
        JLabel passwordLabel = new JLabel("Password");
        midlePanel.setLayout(new GridLayout(15, 1));

        this.registerButton = new JButton("Register");
        this.registerButtonPanel.add(registerButton);

        phonePanel.add(phoneLabel);
        phonePanel.add(phoneTextFiled);

        fullNamePanel.add(fullNameLabel);
        fullNamePanel.add(fullNameTextFiled);

        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordTextField);

        emailPanel.add(emalLabel);
        emailPanel.add(emailTextFiled);

        locationPanel.add(localtionLabel);
        locationPanel.add(localTextFiled);

        userTypePanel.add(userTypeLabel);
        userTypePanel.add(userTypeComboBox);

        midlePanel.add(userTypePanel);
        midlePanel.add(new JLabel());
        midlePanel.add(fullNamePanel);
        midlePanel.add(new JLabel());
        midlePanel.add(emailPanel);
        midlePanel.add(new JLabel());
        midlePanel.add(phonePanel);
        midlePanel.add(new JLabel());
        midlePanel.add(passwordPanel);
        midlePanel.add(new JLabel());
        midlePanel.add(locationPanel);
        midlePanel.add(new JLabel());
        midlePanel.add(registerButtonPanel);
        this.setLayout(new BorderLayout());
        this.add(headerPanel, BorderLayout.NORTH);
        this.add(midlePanel, BorderLayout.CENTER);

        JLabel signupLabel = new JLabel("SignupPage");
        headerPanel.add(signupLabel);

    }

    public void changeLocation() {
        String selectedUserType = userTypeComboBox.getItemAt(userTypeComboBox.getSelectedIndex());
        if (selectedUserType.equals("costumer")) {
            locationPanel.setVisible(false);
        } else {
            locationPanel.setVisible(true);
        }
    }

    public JComboBox<String> getUserTypeBox() {
        return userTypeComboBox;
    }

}
