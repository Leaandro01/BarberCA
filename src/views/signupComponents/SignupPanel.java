
package views.signupComponents;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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
    private JPanel locationPanel;
    private JPanel userTypePanel;
    private JComboBox<String> userTypeComboBox;
    private JTextField emailTextfiled;
    private JTextField localTextfiled;

    public SignupPanel() {

        this.headerPanel = new JPanel();
        this.midlePanel = new JPanel();

        locationPanel = new JPanel();
        midlePanel = new JPanel();
        headerPanel = new JPanel();
        emailPanel = new JPanel();
        userTypePanel = new JPanel();
        emailTextfiled = new JTextField(10);
        localTextfiled = new JTextField(10);


        emailPanel.setLayout(new GridLayout(1, 2));
        locationPanel.setLayout(new GridLayout(1, 2));
        userTypePanel.setLayout(new GridLayout(1, 2));

        userTypeComboBox = new JComboBox(new String[]{"costumer", "service provaid"});
        locationPanel.setVisible(false);
        JLabel emalLabel = new JLabel("Email");
        JLabel userTypeLabel = new JLabel("User Type");
        JLabel localtionLabel = new JLabel("Location");
        midlePanel.setLayout(new GridLayout(15, 1));

        emailPanel.add(emalLabel);
        emailPanel.add(emailTextfiled);

        locationPanel.add(localtionLabel);
        locationPanel.add(localTextfiled);

        userTypePanel.add(userTypeLabel);
        userTypePanel.add(userTypeComboBox);

        midlePanel.add(userTypePanel);
        midlePanel.add(new JLabel());
        midlePanel.add(emailPanel);
        midlePanel.add(new JLabel());
        midlePanel.add(locationPanel);

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