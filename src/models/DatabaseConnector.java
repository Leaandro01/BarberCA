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

        bankUrl = "localhost"; // @TODO: Change to "52.50.23.197"
        bankName = "barber_system";
        user = "root"; // @TODO: Change it to "Rafael_2019335"
        password = ""; // @TODO: Change it to "2019335"


        try {
            Class.forName("com.mysql.jdbc.Driver"); // "jdbc:mysql://localhost/barber_system
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