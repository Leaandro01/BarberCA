
package models.entities;

import java.util.List;

public class Customer extends User {
    public Customer(int id, String fullName, String email, String phone, String password, List<Booking> bookingList) {
        super(id, fullName, email, phone, password, bookingList);
    }
}