package com.company.management;
import java.util.*;
public class Hotel implements HotelManagement {
    private String hotelName;
    private String hotelLocation;
    private ArrayList<Room> listOfRooms;

    public Hotel( String hotelLocation,ArrayList<Room> listOfRooms,String hotelName) {
        this.hotelName = hotelName;
        this.hotelLocation = hotelLocation;
        this.listOfRooms =listOfRooms;
    }
public Hotel(){}

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public ArrayList<Room> getListOfRooms() {
        return listOfRooms;
    }
    public boolean addRoom(Room room){
        if(listOfRooms.add(room))
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", hotelLocation='" + hotelLocation + '\'' +
                ", listOfRooms=" + listOfRooms +
                '}';
    }
}
