/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.barberPanel;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
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
                String originalText = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
        String[] originalTextArray = originalText.split(" ");
        String textToChange = "";

        for (int i = 0; i < originalTextArray.length; i++) {
            textToChange += originalTextArray[i] + " ";

            if (i % 5 == 0) {
                textToChange += "<br>";
            }
        }
        JLabel welcomingText = new JLabel("<html><body> Foo" + textToChange + "</body></html");
        this.add(welcomingText);
        this.add(this.buttonbarberPlatPanel);
        
        String originalText2 = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
        String[] originalTextArray2 = originalText2.split(" ");
        String textToChange2 = "";

        for (int i = 0; i < originalTextArray2.length; i++) {
            textToChange2 += originalTextArray2[i] + " ";

            if (i % 5 == 0) {
                textToChange2 += "<br>";
            }
        }
        JLabel welcomingText2 = new JLabel("<html><body> Foo" + textToChange2 + "</body></html");
        this.add(welcomingText2);
        this.add(this.buttonbarberPlatPanel2);

        JButton viewCostumer = new JButton("View yours costumers");
        this.buttonbarberPlatPanel.add(viewCostumer);

        JButton slotsTable = new JButton("Slots Tables");
        this.buttonbarberPlatPanel2.add(slotsTable);
        this.setLayout(new GridLayout(2, 1));

        this.add(this.buttonbarberPlatPanel);
        this.add(this.buttonbarberPlatPanel2);
    }

}
