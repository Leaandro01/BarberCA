/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.slotesPlatform;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SlotesPanel extends JPanel {

    private JPanel northSubPanel;
    private JPanel middleSubPanel;
    private JPanel southSubPanel;
    private JButton subButton;
    private JTable slotesTable; 
    public SlotesPanel() {

        this.setLayout(new BorderLayout());
        this.northSubPanel = new JPanel();
        this.middleSubPanel = new JPanel();
        this.southSubPanel = new JPanel();
        
        
        this.add(this.northSubPanel, BorderLayout.NORTH);
        this.add(this.middleSubPanel, BorderLayout.CENTER);
        this.add(this.southSubPanel, BorderLayout.SOUTH);

        JLabel northSubPanelLabel = new JLabel("Slotes Platform");
        JLabel southSubPanelLabel = new JLabel("Almicar CA");
        
    

        this.northSubPanel.add(northSubPanelLabel);
        this.southSubPanel.add(southSubPanelLabel);

        subButton = new JButton("Submit");
        southSubPanel.add(subButton);
    String [] columnName = {"Dates","Time","Localization","Postal Code"};
        Object [][] data ={
            {"algo","algo2","algo3","asa","asa" },
            {"bb","bbb","bbbo","!sasa","1121"},
            {"bb","bbb","bbbo","!sasa","1121"},
            {"bb","bbb","bbbo","!sasa","1121"},
            {"bb","bbb","bbbo","!sasa","1121"},
            {"bb","bbb","bbbo","!sasa","1121"}
        };
        
        this.slotesTable = new JTable(data,columnName);
        slotesTable.setPreferredScrollableViewportSize(new Dimension(500,50));
        slotesTable.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(slotesTable);
        add(scrollPane);
        
    }

}
