package com.company.application;
import com.company.resources.Database;
import com.company.resources.Resources;
import com.company.errors.*;
import com.company.user.User;
import com.company.user.UserPageHandler;

import javax.xml.crypto.Data;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int loginChoice;
        boolean loginFlag=true;
        System.out.println("\t\tHotel Reservation System");
        System.out.println("1.User Login");
        System.out.println("2.Admin Login");
        System.out.print("Enter your choice : ");
        loginChoice=Integer.parseInt(Resources.input.nextLine().charAt(0)+"");
        while(loginFlag) {
            switch (loginChoice) {
                case 1: {
                    System.out.println("Enter user name : ");
                    String userName = Resources.input.nextLine();
                    System.out.println("Enter user password : ");
                    String userPassword = Resources.input.nextLine();
                    User currentUser = null;
                    for (User user : Database.listOfUsers) {
                        if (user.getUserName() == userName && user.getUserPassword() == userPassword) {
                            currentUser = user;
                        }
                    }
                    if (currentUser == null)
                    {
                        currentUser=new User(userName,userPassword);
                        Database.listOfUsers.add(currentUser);
                    }
                    UserPageHandler.userPage(currentUser);
                    loginFlag=false;
                    break;
                }
                case 2: {
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                    loginFlag=false;
                }
            }
        }


    }
}
