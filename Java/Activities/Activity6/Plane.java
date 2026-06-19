package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
    //Private access modifier
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;

    //Constructor
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    //Method to add passenger
    public void onboard(String passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
        } else {
            System.out.println("Plane is full. Cannot add more passengers.");
        }
    }

    //Method to simulate takeoff
    public Date takeOff() {
        lastTimeTookOff = new Date();
        return lastTimeTookOff;
    }

    //Method to simulate landing
    public void land() {
        lastTimeLanded = new Date();
        passengers.clear(); //clear passengers after landing
    }

    //Getter for lastTimeLanded
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    //Getter for passengers
    public List<String> getPassengers() {
        return passengers;
    }
}
