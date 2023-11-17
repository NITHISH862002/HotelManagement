package com.company.resources;
import com.company.management.Hotel;
import com.company.management.Room;
import com.company.user.*;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
public class Database {
    public static ArrayList<User> listOfUsers=new ArrayList<>(Arrays.asList(new User("sanjiv","0000"),new User("test","1111")));

    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public static Date date1;
    public static Date date2;
    public static Date date3;
    public static Date date4;

    {
        try {
            date1 = sdf.parse("2020-07-20");
            date2 = sdf.parse("2020-07-25");
            date3 = sdf.parse("2020-07-15");
            date4 = sdf.parse("2020-08-04");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static List<Hotel> listOfHotel=new ArrayList<Hotel>(Arrays.asList(
            new Hotel("chennai",new ArrayList<Room>(Arrays.asList(new Room("HL101","Single AC",2500,4.3f,new ArrayList(Arrays.asList(date1,date2))))),"hotel lotus"),
            new Hotel("chennai",new ArrayList<Room>(Arrays.asList(new Room("HL102","double AC",3500,4.3f,new ArrayList(Arrays.asList(date2,date3))))),"hotel lotus"),
            new Hotel("chennai",new ArrayList<Room>(Arrays.asList(new Room("HL103","Single Non-AC",2000,4.3f,new ArrayList(Arrays.asList(date1,date4))))),"hotel lotus"),
            new Hotel("chennai",new ArrayList<Room>(Arrays.asList(new Room("HL104","double Non-AC",2000,4.3f,new ArrayList(Arrays.asList(date1,date3))))),"hotel lotus"),
            new Hotel("chennai",new ArrayList<Room>(Arrays.asList(new Room("HBL101","Single AC",2500,3.3f,new ArrayList(Arrays.asList(date1,date3))))),"hotel bay leaf"),
            new Hotel("chennai",new ArrayList<Room>(Arrays.asList(new Room("HBL102","double AC",2500,3.3f,new ArrayList(Arrays.asList(date2,date4))))),"hotel bay leaf"),
            new Hotel("chennai",new ArrayList<Room>(Arrays.asList(new Room("HBL103","Single Non-AC",2500,3.3f,new ArrayList(Arrays.asList(date1,date4))))),"hotel bay leaf"),
            new Hotel("chennai",new ArrayList<Room>(Arrays.asList(new Room("HBL104","double Non-AC",2500,3.3f,new ArrayList(Arrays.asList(date1,date2))))),"hotel bay leaf"),
            new Hotel("coimbatore",new ArrayList<Room>(Arrays.asList(new Room("HR101","Single AC",5500,4.9f,new ArrayList(Arrays.asList(date1,date3))))),"hotel radison"),
            new Hotel("coimbatore",new ArrayList<Room>(Arrays.asList(new Room("HR102","double AC",6500,4.9f,new ArrayList(Arrays.asList(date2,date4))))),"hotel radison"),
            new Hotel("coimbatore",new ArrayList<Room>(Arrays.asList(new Room("HR103","Single Non-AC",3500,4.9f,new ArrayList(Arrays.asList(date1,date4))))),"hotel radison"),
            new Hotel("coimbatore",new ArrayList<Room>(Arrays.asList(new Room("HR104","double Non-AC",2500,4.9f,new ArrayList(Arrays.asList(date1,date2))))),"hotel radison"),
            new Hotel("coimbatore",new ArrayList<Room>(Arrays.asList(new Room("HZ101","Single AC",7500,4f,new ArrayList(Arrays.asList(date1,date3))))),"hotel ZONE"),
            new Hotel("coimbatore",new ArrayList<Room>(Arrays.asList(new Room("HZ102","double AC",8500,4f,new ArrayList(Arrays.asList(date2,date4))))),"hotel ZONE"),
            new Hotel("coimbatore",new ArrayList<Room>(Arrays.asList(new Room("HZ103","Single Non-AC",5500,4f,new ArrayList(Arrays.asList(date1,date4))))),"hotel ZONE"),
            new Hotel("coimbatore",new ArrayList<Room>(Arrays.asList(new Room("HZ104","double Non-AC",6500,4f,new ArrayList(Arrays.asList(date1,date2))))),"hotel ZONE")

            ));

}
