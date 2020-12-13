/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.client;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class ciientFormSubPanel extends JPanel {

    private JPanel emailPanel;
    private JPanel fullNamePanel;
    private JPanel phonePanel;
    private JPanel passwordPanel;
    private JPanel buttonPanel;

    public ciientFormSubPanel() {
       
        this.emailPanel = new JPanel();
        this.passwordPanel = new JPanel();
        this.fullNamePanel = new JPanel();
        this.phonePanel = new JPanel();
        this.buttonPanel = new JPanel();

        JTextField emailClientTextField = new JTextField(10);
        JLabel emailClientLabel = new JLabel("Email");
        this.emailPanel.add(emailClientLabel);
        this.emailPanel.add(emailClientTextField);

        JTextField nameClientTextField = new JTextField(10);
        JLabel nameClientLabel = new JLabel("Full name");
        this.fullNamePanel.add(nameClientLabel);
        this.fullNamePanel.add(nameClientTextField);

        JTextField phoneClientTextField = new JTextField(10);
        JLabel phonelClientLabel = new JLabel("Phone");
        this.phonePanel.add(phonelClientLabel);
        this.phonePanel.add(phoneClientTextField);

        JTextField passwordClientTextField = new JTextField(10);
        JLabel passwordClientLabel = new JLabel("Passowrd");
        this.passwordPanel.add(passwordClientLabel);
        this.passwordPanel.add(passwordClientTextField);

        JButton signinButton = new JButton("Signin");
        this.buttonPanel.add(signinButton);

        this.setLayout(new GridLayout(9, 1));
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(new JLabel());
        this.add(this.emailPanel);
        this.add(this.passwordPanel);
        this.add(this.fullNamePanel);
        this.add(this.phonePanel);
        this.add(this.buttonPanel);
        this.add(new JLabel());

    }
}
