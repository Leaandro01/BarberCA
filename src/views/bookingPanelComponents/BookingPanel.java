package views.bookingPanelComponents;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Arrays;


public class BookingPanel extends JPanel {

    private JTextField searchField;
    private JButton seeYourBookingButton;
    private SlotesArea slotesArea;

    public BookingPanel(){
        
        //@todo fake date to do
        
        String [] dates = new String[]{"10/05/2020 7:00","10/05/2020 7:00","10/05/2020 7:00"};
        this.slotesArea = new SlotesArea(dates);
        
        this.searchField = new JTextField(9);
        seeYourBookingButton = new JButton("See Your Button");
        searchField.setText("Search Here");


        JPanel headerPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        /**
         * Creating the subpanels for centralizing components
         */
        JPanel leftTitlePanel = new JPanel();

        JPanel rightTitlePanel = new JPanel();

        JPanel leftSearchPanel = new JPanel();

        JPanel rightSearchPanel = new JPanel();

        JLabel title = new JLabel("Booking Panel");

        headerPanel.add(leftTitlePanel);
        headerPanel.add(title);
        headerPanel.add(rightTitlePanel);

        headerPanel.add(leftSearchPanel);
        headerPanel.add(searchField);
        headerPanel.add(rightSearchPanel);



        headerPanel.setLayout(new GridLayout(2,3));


        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();

        leftPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        centerPanel.setLayout(new GridLayout(1,2));

        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);


        String originalText = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
        String[] originalTextArray = originalText.split(" ");
        String textToChange = "";

        for(int i = 0; i < originalTextArray.length; i++){
            textToChange += originalTextArray[i]+" ";

            if(i%5 == 0){
                textToChange += "<br>";
            }
        }



        //JLabel welcomingText = new JLabel("");
        JLabel welcomingText = new JLabel("<html><body> Foo"+textToChange+"</body></html");
        leftPanel.add(welcomingText);
        leftPanel.add(this.seeYourBookingButton);
        
        rightPanel.setLayout(new BorderLayout());
         //@todo make the name dynamic this will come from the controller
        rightPanel.add(new JLabel("Rafael Alcatanra Avaleable bookings slots"));
        rightPanel.add(this.slotesArea);
       
        


        this.setLayout(new BorderLayout());
        this.add(headerPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);



    }
}