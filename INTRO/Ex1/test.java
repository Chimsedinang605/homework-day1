package INTRO.Ex1;

import java.util.Scanner;

public class test {
   public static void main(String[] args) {
   
      Scanner s1 = new Scanner(System.in);

      System.out.print("Enter radius: ");
      Double radi = s1.nextDouble();

      Circle circle = new Circle(radi);
      Circle circle2 = new Circle(2);

      // circle2.radius = 4; error
      System.out.printf("Radius: "+ radi 
                        +"\nArea: %.2f%n", circle.getArea());
      System.out.println(circle2); // calls toString() implicitly

      Circle circle3 = new Circle();
      circle3.setColor("yellow");
      circle3.setRadius(2.6);;

      System.out.printf("color: "+ circle3.getColor());
      System.out.printf("%narea: "+circle3.getArea());

      s1.close();
   }
}
