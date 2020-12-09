//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private Connection connection;
    private String bankUrl = "localhost";
    private String bankName = "barber_system";
    private String user = "root";
    private String password = "";

    public DatabaseConnector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://" + this.bankUrl + "/" + this.bankName, this.user, this.password);
            System.out.println("Conectou no banco de dados.");
        } catch (SQLException var2) {
            System.out.println("Erro: Não conseguiu conectar no BD.");
        } catch (ClassNotFoundException var3) {
            System.out.println("Erro: Não encontrou o driver do BD.");
        }

    }

    public Connection getConnection() {
        return this.connection;
    }
}