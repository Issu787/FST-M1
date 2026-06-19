package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity10 {
    public static void main(String[] args) {
        //Create Map with Integer keys and String values
    	HashMap<Integer, String> colours = new HashMap<>();

        //Add 5 random colours
        colours.put(1, "A");
        colours.put(2, "B");
        colours.put(3, "X");
        colours.put(4, "Y");
        colours.put(5, "Z");

        //Print the Map
        System.out.println("Original Map: " + colours);

        //Remove one colour
        colours.remove(4); // removes Yellow
        System.out.println("After removing key 4: " + colours);

        //Check if 'Green' exists
        System.out.println("Does the Map contain 'Green'? " + colours.containsValue("Green"));

        //Print size of the Map
        System.out.println("Size of the Map: " + colours.size());
    }
}
