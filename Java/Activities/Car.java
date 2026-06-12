package activities;

public class Car {
  int make;
  String color;
  String transmission;
  int tyres;
  int doors;
  
  Car(String color, String transmission, int make) {
      this.color = color;
      this.transmission = transmission;
      this.make = make;
      this.tyres = 4;  
      this.doors = 4;  
  }
  
  void displayCharacteristics() {
	  System.out.println("Below are the Car details: ");
      System.out.println("Color: " + color);
      System.out.println("Transmission: " + transmission);
      System.out.println("Make: " + make);
      System.out.println("Tyres: " + tyres);
      System.out.println("Doors: " + doors);
      
  }
  void accelerate() {
	  System.out.println("\nWhile Accelerate....");
      System.out.println("Car is moving forward.");
  }

  void brake() {
	  System.out.println("\nWhile Brake...");
      System.out.println("Car has stopped.");
  }
}
