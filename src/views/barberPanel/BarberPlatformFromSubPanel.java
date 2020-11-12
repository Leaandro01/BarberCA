/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.barberPanel;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class BarberPlatformFromSubPanel extends JPanel {

    private JPanel buttonbarberPlatPanel;
    private JPanel buttonbarberPlatPanel2;

    public BarberPlatformFromSubPanel() {

        this.buttonbarberPlatPanel = new JPanel();

        this.buttonbarberPlatPanel2 = new JPanel();

        JButton viewCostumer = new JButton("View yours costumers");
        this.buttonbarberPlatPanel.add(viewCostumer);

        JButton slotsTable = new JButton("Slots Tables");
        this.buttonbarberPlatPanel2.add(slotsTable);
        this.setLayout(new GridLayout(2, 1));

        this.add(this.buttonbarberPlatPanel);
        this.add(this.buttonbarberPlatPanel2);
    }

}
