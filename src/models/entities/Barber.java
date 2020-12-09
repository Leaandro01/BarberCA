package models.entities;

import java.util.List;

public class Barber extends User{

    private String location;

    public Barber(int id, String fullName, String email, String phone, String password, List<Booking> bookingList, String location) {
        super(id, fullName, email, phone, password, bookingList);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
