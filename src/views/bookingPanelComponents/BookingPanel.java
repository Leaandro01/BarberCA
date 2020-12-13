package views.bookingPanelComponents;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Arrays;


public class BookingPanel extends JPanel {

    private JLabel  userNameLabel;
    private JTextField searchField;
    private JButton seeYourBookingsButton;
    private SlotesArea slotArea;
    private String userName;
    private JPanel leftPanel;
     private JButton yourbooking;
    public BookingPanel(){

        this.searchField = new JTextField(9);
        this.seeYourBookingsButton = new JButton("Barber Platform");
        this.yourbooking = new JButton("See your Booking");
        userNameLabel = new JLabel("Hello " +userName);
        // @TODO Fake data -> This is to be retrieved from the database later on
        String[] dates = new String[]{"20/12/2020 7:00", "20/12/2020 8:00", "20/12/2020 9:00", "20/12/2020 10:00"};

        userNameLabel = new JLabel();

        this.slotArea = new SlotesArea(dates);

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


         leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();

        leftPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.black));

        centerPanel.setLayout(new GridLayout(1,2));

        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);


        String originalText = "To go to barber Platform";
        String[] originalTextArray = originalText.split(" "); // ["Sed", "ut", "perspiciatis", ...]
        String textToChange = "";

        for(int i = 0; i < originalTextArray.length; i++){
            textToChange += originalTextArray[i]+ " ";

            if(i%5 == 0){
                textToChange += "<br>";
            }
        }



      
        JLabel welcomingText = new JLabel("<html><body>"+textToChange+"</body></html");
        leftPanel.add(welcomingText);
        leftPanel.add(this.seeYourBookingsButton);

        String originalText1= "See your booking in here! ";
        String[] originalTextArray1 = originalText1.split(" "); // ["Sed", "ut", "perspiciatis", ...]
        String textToChange1 = "";

        for(int i = 0; i < originalTextArray1.length; i++){
            textToChange1 += originalTextArray1[i]+ " ";

            if(i%5 == 0){
                textToChange1 += "<br>";
            }
        }



      
        JLabel welcomingText1 = new JLabel("<html><body>"+textToChange1+"</body></html");
        leftPanel.add(welcomingText1);
        leftPanel.add(this.yourbooking);
        rightPanel.setLayout(new BorderLayout());
        
        // @TODO Make the name dymamic. This will come from the controller.
        rightPanel.add(userNameLabel, BorderLayout.NORTH);
        rightPanel.add(this.slotArea);


        this.setLayout(new BorderLayout());
        this.add(headerPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);

    }
        // getting the user name from my data base
    public void setUserName(String userName){
        this.userName = userName;
        this.userNameLabel.setText("Welcome, "+userName);

        validate();
        repaint();
    }
    // getter for bookingsbutton
    public JButton getseeYourBookingsButton(){
   
        return seeYourBookingsButton;
    }
        
    
}
