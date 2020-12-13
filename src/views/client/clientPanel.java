/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.client;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class clientPanel extends JPanel implements ActionListener {

    private JPanel northSubPanel;
    private JPanel middleSubPanel;
    private JPanel southSubPanel;
    
  
   
   
    public clientPanel() {
       
        //creater a client panel and getting the information from ciientFormSubPanel
        this.setLayout(new BorderLayout());
        this.northSubPanel = new JPanel();
        this.middleSubPanel = new ciientFormSubPanel();
        this.southSubPanel = new JPanel();

        this.add(this.northSubPanel, BorderLayout.NORTH);
        this.add(this.middleSubPanel, BorderLayout.CENTER);
        this.add(this.southSubPanel, BorderLayout.SOUTH);
        
        JLabel northSubPanelLabel = new JLabel("Client Register");
        JLabel southSubPanelLabel = new JLabel("Almicar CA");
        
        this.northSubPanel.add(northSubPanelLabel);
        this.southSubPanel.add(southSubPanelLabel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
