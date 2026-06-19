package activities;

 interface BicycleParts {
    int tyres = 2;       // number of tyres
    int maxSpeed = 100;  // max speed of bicycle
}

 interface BicycleOperations {
    void applyBrake(int decrement);
    void speedUp(int increment);
}
 
//Base class 
 class Bicycle implements BicycleParts, BicycleOperations {
  protected int gears;
  protected int currentSpeed;

  // Constructor
  public Bicycle(int gears, int currentSpeed) {
      this.gears = gears;
      this.currentSpeed = currentSpeed;
  }

  // Implement applyBrake
  @Override
  public void applyBrake(int decrement) {
      currentSpeed -= decrement;
      System.out.println("Current speed after brake: " + currentSpeed);
  }

  // Implement speedUp
  @Override
  public void speedUp(int increment) {
      currentSpeed += increment;
      System.out.println("Current speed after speeding up: " + currentSpeed);
  }

  // Description method
  public String bicycleDesc() {
      return ("No of gears are " + gears + "\nSpeed of bicycle is " + maxSpeed);
  }
}


//Derived class
 class MountainBike extends Bicycle {
 private int seatHeight;

 // Constructor
 public MountainBike(int gears, int currentSpeed, int seatHeight) {
     super(gears, currentSpeed); // call Bicycle constructor
     this.seatHeight = seatHeight;
 }

 // Setter for seatHeight
 public void setHeight(int newValue) {
     seatHeight = newValue;
 }

 // Override description
 @Override
 public String bicycleDesc() {
     return super.bicycleDesc() + "\nSeat height is " + seatHeight;
 }
}

//Driver class 
public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(30);
        mb.applyBrake(5);
    }
}
