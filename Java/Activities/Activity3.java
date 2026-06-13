package activities;

public class Activity3 {

 public static String adjustDevice(String device, Integer value) {
 
     if (device == null || value == null) {
         return "Error: Device or value cannot be null.";
     }

     String status;

     switch (device.toUpperCase()) {
         case "THERMOSTAT":
             if (value >= 40) {
                 status = "[Thermostat] Warning: Temperature high.";
             } else {
                 status = "[Thermostat] Temperature is set to " + value + ".";
             }
             break;

         case "LIGHT":
             status = "[Light] Adjusting brightness to " + value + "%.";
             break;

         default:
             status = "Error: Unknown device.";
     }

     return status;
 }

 public static void main(String[] args) {

     System.out.println(adjustDevice("THERMOSTAT", 45));  
     System.out.println(adjustDevice("THERMOSTAT", 25));  
     System.out.println(adjustDevice("LIGHT", 70));       
     System.out.println(adjustDevice(null, 30));         
     System.out.println(adjustDevice("FAN", 10));        
 }
}
