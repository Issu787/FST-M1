package activities;

import java.util.ArrayList;

public class Activity8 {
    public static void main(String[] args) {
        //Create ArrayList of type String
        ArrayList<String> myList = new ArrayList<>();

        //Add 5 names
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Ishaq");
        myList.add("David");
        myList.add("Eve");

        //Print all names using for loop
        System.out.println("All names in the list:");
        for (String name : myList) {
            System.out.println(name);
        }

        //Retrieve 3rd name using get()
        System.out.println("\n3rd name in the list: " + myList.get(2));

        //using contains()
        String checkName = "Ishaq";
        System.out.println("\nDoes the list contain '" + checkName + "'? " + myList.contains(checkName));

        //Print size of the list
        System.out.println("\nNumber of names in the list: " + myList.size());

        // Remove a name and print size again
        myList.remove("David");
        System.out.println("\nAfter removing 'David', number of names in the list: " + myList.size());
    }
}
