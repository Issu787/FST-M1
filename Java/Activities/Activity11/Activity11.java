package activities;

interface Addable {
    int add(int num1, int num2);
}

public class Activity11 {
 public static void main(String[] args) {
     //Lambda expression without body (single expression)
     Addable ad1 = (a, b) -> a + b;

     //Lambda expression with body
     Addable ad2 = (a, b) -> {
         return a + b;
         //return sum;
     };

     //Test both lambdas
     System.out.println("Result using ad1: " + ad1.add(10, 20));
     System.out.println("Result using ad2: " + ad2.add(15, 25));
 }
}
