package activities;

import java.util.HashSet;

public class Activity9 {
 public static void main(String[] args) {
     //Create HashSet
     HashSet<String> hs = new HashSet<>();

     //Add 6 objects
     hs.add("Apple");
     hs.add("Banana");
     hs.add("Cherry");
     hs.add("Date");
     hs.add("Elderberry");
     hs.add("Fig");

     // Print size of HashSet
     System.out.println("Size of HashSet: " + hs.size());

     // Remove an element
     hs.remove("Date");
     System.out.println("After removing 'Date', size: " + hs.size());

     // Try to remove an element not present
     boolean removed = hs.remove("Grapes");
     System.out.println("Trying to remove 'Grapes': " + removed);

     // Check if an item exists
     System.out.println("Does HashSet contain 'Apple'? " + hs.contains("Apple"));

     // Print updated set
     System.out.println("Updated HashSet: " + hs);
 }
}
