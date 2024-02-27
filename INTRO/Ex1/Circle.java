package INTRO.Ex1;

public class Circle {
   private double radius;
   private String color;
   // Constructors
   public Circle(){
      this.radius = 1.0;
      this.color = "red";
   }

   public Circle(double radius, String color) {
      this.radius = radius;
      this.color = color;
   }

   public Circle(double radius) {
      this.radius = radius;
      this.color = "red";
   }

   // getter: access instance variables
   public double getRadius() {
      return radius;
   }

   public String getColor() {
      return color;
   }

   // setter: change the values
   public void setRadius(double radius) {
      this.radius = radius;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public double getArea() {
      return radius*radius*Math.PI;
   }

   @Override
   public String toString() {
      return "Circle [radius=" + radius + ", color=" + color + "]";
   }

   
}
