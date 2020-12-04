import controllers.Controller;
import models.DatabaseConnector;
import models.entities.Barber;
import models.entities.Customer;
import models.entities.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BarberCA {


    BarberCA(){
       // Controller controllerr= new Controller();
        new Controller();

    }



    public static void main(String[] args) {
	// write your code here
        new BarberCA();

    }
}
