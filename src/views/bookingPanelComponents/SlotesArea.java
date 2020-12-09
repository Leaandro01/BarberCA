package views.bookingPanelComponents;

import javax.swing.*;
import java.awt.*;

public class SlotesArea extends JPanel {

    private String[] dates;


    public SlotesArea(String[] dates){
        this.dates = dates;

        this.setLayout(new GridLayout(this.dates.length, 1));

        for (String date : dates) {

            JPanel slotPanel = new JPanel();
            JLabel dateLabel = new JLabel(date);
            JButton button = new JButton("Book now.");

            slotPanel.add(dateLabel);
            slotPanel.add(button);


            this.add(slotPanel);
        }

    }
}
