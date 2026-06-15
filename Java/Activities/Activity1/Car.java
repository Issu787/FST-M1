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
      System.out.println("Car Color: " + color);
      System.out.println("Car Transmission: " + transmission);
      System.out.println("Car Make: " + make);
      System.out.println("Car Tyres: " + tyres);
      System.out.println("Car Doors: " + doors);
  }
  void accelerate() {
      System.out.println("Car is moving forward.");
  }

  void brake() {
      System.out.println("Car has stopped.");
  }
}
