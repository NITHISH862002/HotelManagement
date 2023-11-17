package com.company.user;

import com.company.resources.Resources;

import java.util.logging.Filter;

public class FilterPageHandler {

    public static int filterPageChoiceHandler(){
        System.out.println("1.Filter by Ratings");
        System.out.println("2.Filter by price");
        System.out.println("3.Filter by Type");
        System.out.println("4.Exit");
        System.out.print("Enter your choice : ");
        return Integer.parseInt(Resources.input.nextLine());
    }
    public static void filterpage(User currentUser){

        boolean filterPageFlag=true;
        while(filterPageFlag){
            int filterChoice = FilterPageHandler.filterPageChoiceHandler();
            switch(filterChoice){
                case 1:
                {
                    System.out.println("Enter minimum rating : ");
                    String userPreferredRating=Resources.input.nextLine();
                    currentUser.setUserFilters("Rating",userPreferredRating);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter maximum price : ");
                    String userPreferredPrice=Resources.input.nextLine();
                    currentUser.setUserFilters("Price",userPreferredPrice);
                    break;
                }
                case 3:
                {

                    System.out.println("Enter preferred type of room : ");
                    String userPreferredType=Resources.input.nextLine();
                    currentUser.setUserFilters("Type",userPreferredType);
                    break;
                }
                case 4:
                {
                    filterPageFlag=false;
                    break;
                }
                default:{
                    System.out.println("Invalid choice");
                }
            }
        }
    }


}
