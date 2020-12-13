package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    private Connection connection;
    private String bankUrl;
    private String bankName;
    private String user;
    private String password;

    public DatabaseConnector() {
        //setting the data base that amilcar gave us
        bankUrl = "52.50.23.197"; 
        bankName = "Rafael_2019335";
        user = "Rafael_2019335"; 
        password = "2019335"; 


        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            connection = DriverManager.getConnection("jdbc:mysql://"+bankUrl+"/"+bankName, user, password);
            System.out.println("Conectou no banco de dados.");
        } catch (SQLException ex) {
            System.out.println("Erro: Não conseguiu conectar no BD.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro: Não encontrou o driver do BD.");
        }
    }


    public Connection getConnection() {
        return connection;
    }
}
