package com.company.user;
import com.company.errors.InvalidDate;
import com.company.management.Hotel;
import com.company.management.Room;
import com.company.resources.Database;
import com.company.resources.Resources;
import com.company.errors.ErrorHandler;
import java.util.*;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class UserPageHandler {
   public static Date checkInDate=null;
   public static Date checkOutDate=null;
    public static void userPageDetails(){
        System.out.println("1.Show All Hotels");
        System.out.println("2.Show All Hotels near me");
        System.out.println("3.Search by name ");
        System.out.println("4.Apply filters");
        System.out.println("5.Remove filters");
        System.out.println("6.Book rooms");
        System.out.println("7.Exit");
    }

    public static void userPage(User currentUser)
    {
        if(UserPageHandler.dateClollector()){
            boolean userPageFalg=true;
            while(userPageFalg) {
                UserPageHandler.userPageDetails();
                System.out.print("Enter Your Choice : ");
                int userChoice=Integer.parseInt(Resources.input.nextLine().charAt(0)+"");
                switch(userChoice){
                    case 1:
                    {

                        double preferredRating=0.0;
                        double preferredPrice=0.0;
                        String preferredType="";
                        if(currentUser.getUserFilters().containsKey("Rating")){
                            preferredRating =  Double.parseDouble(currentUser.getUserFilters().get("Rating"));
                        }
                        if(currentUser.getUserFilters().containsKey("Price")){
                            preferredPrice =  Double.parseDouble(currentUser.getUserFilters().get("Price"));
                        }
                        if(currentUser.getUserFilters().containsKey("Type")){
                            preferredType =  currentUser.getUserFilters().get("Type");
                        }
                        ArrayList<Hotel> temp=new ArrayList<>();
                        System.out.println(preferredPrice+" "+preferredRating+" "+preferredType);
                        if(preferredPrice==0.0 && preferredRating==0.0&& preferredType=="" ){
                            for(Hotel hotel : Database.listOfHotel){
                                temp.add(hotel);
                            }
                        }
                            for (Hotel hotel : Database.listOfHotel) {
                                for(Room room:hotel.getListOfRooms()){
                                    if(room.getRoomRating()>=preferredRating && room.getRoomPrioe()>=preferredPrice && room.getRoomType().contains(preferredType)){
                                        temp.add(hotel);
                                    }
                                }
                            }
                            for(Hotel hotel:temp) {
                                System.out.println(hotel);
                            }
                        break;
                    }
                    case 2:
                    {
                        System.out.print("Enter your current location : ");
                        currentUser.setLocation(Resources.input.nextLine());
                        System.out.println();
                        for(Hotel hotel:Database.listOfHotel) {
                            if(hotel.getHotelLocation().equals(currentUser.getLocation()))
                                System.out.println(hotel);
                        }
                        break;
                    }
                    case 3: {
                        System.out.print("Enter Hotel name : ");
                        String userPreferredName=Resources.input.nextLine();
                        for(Hotel hotel:Database.listOfHotel) {
                            if(hotel.getHotelName().toLowerCase().contains(userPreferredName.toLowerCase()))
                                System.out.println(hotel);
                        }
                        System.out.println();


                        break;
                    }
                    case 4:{
                        FilterPageHandler.filterpage(currentUser);
                        break;
                    }
                    case 5:{

                        break;
                    }
                    case 6:{

                        break;
                    }
                    case 7:{
                        userPageFalg=false;
                    }
                }


            }

        }

    }
    public static boolean dateClollector(){
        System.out.println("\t\t Welcome........");
        boolean dateFlag=true;
        while(dateFlag) {
            System.out.println("Please enter check in date : ");
            SimpleDateFormat dateFormate = new SimpleDateFormat("dd-MM-yyyy");
            Date today = new Date();
            Date todayWithZeroTime = null;
            try {
                todayWithZeroTime = dateFormate.parse(dateFormate.format(today));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            try {
                String temp = Resources.input.nextLine();
                checkInDate = dateFormate.parse(temp);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println("Please enter check out date : ");
            try {
                checkOutDate = dateFormate.parse(Resources.input.nextLine());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            try {
                if (checkInDate.compareTo(checkOutDate) < 0 && checkInDate.compareTo(todayWithZeroTime) >= 0) {
                    dateFlag=false;

                } else {
                    throw new InvalidDate();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return true;
    }


}
