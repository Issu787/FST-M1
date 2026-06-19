package activities;

public class Activity6 {
    public static void main(String[] args) {
        
        Plane plane = new Plane(10);

        plane.onboard("Alice");
        plane.onboard("Bob");
        plane.onboard("Charlie");

        System.out.println("Take-off time: " + plane.takeOff());

        // Print passengers onboard
        System.out.println("Passengers onboard: " + plane.getPassengers());

        try {
            // Pause execution for 5 seconds to emulate flight
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Land the plane
        plane.land();

        // Print landing time
        System.out.println("Landing time: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
    }
}
