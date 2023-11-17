package com.company.user;
import com.company.management.*;
import com.company.management.HotelManagement;
import java.util.*;
public class User {
    private String userName;
    private String userPassword;
    private String location;
    private HashMap<String,String> userFilters;
    private HashMap<HotelManagement,ArrayList<Date>> bookedRooms;

    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.bookedRooms =new HashMap<>();
        this.userFilters=new HashMap<>();
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public HashMap<HotelManagement, ArrayList<Date>> getBookedRooms() {
        return bookedRooms;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public HashMap<String, String> getUserFilters() {
        return userFilters;
    }

    public void setUserFilters(String key, String value) {
        this.userFilters.put(key,value);
    }

}
