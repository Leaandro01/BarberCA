package models.operations;

import models.DatabaseConnector;
import models.UserTypes;
import models.entities.Barber;
import models.entities.Booking;
import models.entities.Customer;
import models.entities.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDatabaseOperation implements DatabaseOperation<User>{


    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public User select(User user) {
        DatabaseConnector databaseConnector = new DatabaseConnector();

        Integer id = user.getId();
        String email = user.getEmail();
        String password = user.getPassword();

        Connection connection = databaseConnector.getConnection();

        try {
            Statement statement = connection.createStatement();
            User selectedUser = null;

            ResultSet resultSet;

            String query = "select * from user where email_address='"+email+"' and password='"+password+"';";
            System.out.println(query);
            if(email != null && password != null){
                resultSet = statement.executeQuery("select * from user where email_address='"+email+"' and password='"+password+"';");
            }else{
                resultSet = statement.executeQuery("select * from user where user_id='"+id+"';");
            }



            while (resultSet.next()){
                UserTypes userType = UserTypes.valueOf(resultSet.getString("type").toUpperCase());

                Integer selectedId = resultSet.getInt("user_id");
                String fullName = resultSet.getString("full_name");
                String returnedEmail = resultSet.getString("email_address");
                String phone = resultSet.getString("phone_number");
                String returnedPassword = resultSet.getString("password");

                System.out.println("Hello");

                if(userType == UserTypes.BARBER){
                    return new Barber(selectedId, fullName, returnedEmail, phone, returnedPassword, null, null);
                    //return selectedUser;
                }else{
                    return new Customer(selectedId, fullName, returnedEmail, phone, returnedPassword, null);
                    //return selectedUser;
                }
            }
            return selectedUser;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public void insert(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }
}
