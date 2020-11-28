//import controllers.Controller;
import models.DatabaseConnector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Barber_Ca {


    Barber_Ca(){
        //new Controller();

        DatabaseConnector databaseConnector = new DatabaseConnector();

        Connection connection = databaseConnector.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user;");
            System.out.println("id | name | email | phone");
            System.out.println("__________________________");
            System.out.println();
            while (resultSet.next()){ // <- cursor - Iterator
                System.out.print(resultSet.getString("user_id") + "  | ");
                System.out.print(resultSet.getString("full_name") +" | ");
                System.out.print(resultSet.getString("email_address") + " | ");
                System.out.print(resultSet.getString("phone_number"));

                System.out.println();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }



    public static void main(String[] args) {
	// write your code here
        new Barber_Ca();

    }
}
