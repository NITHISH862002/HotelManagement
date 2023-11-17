package com.company.management;
import java.util.*;
public class Room implements HotelManagement {

    private String roomNumber;
    private String roomType;
    private double roomPrioe;
    private float roomRating;
    private ArrayList<Date> bookedDates;

    public Room(String roomNumber, String roomType, double roomPrioe, float roomRating,ArrayList<Date> bookedDates) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrioe = roomPrioe;
        this.roomRating = roomRating;
        this.bookedDates = bookedDates;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getRoomPrioe() {
        return roomPrioe;
    }

    public float getRoomRating() {
        return roomRating;
    }

    public ArrayList<Date> getBookedDates() {
        return bookedDates;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", roomType='" + roomType + '\'' +
                ", roomPrioe=" + roomPrioe +
                ", roomRating=" + roomRating +
                ", bookedDates=" + bookedDates +
                '}';
    }
}
