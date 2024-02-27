package on_tap_oop;

public class Circle extends Shape {
   protected double radius;

   public Circle() {
      this.radius = 1.0;
   }

   public Circle(double radius) {
      this.radius = radius;
   }

   public Circle(double radius, String color, boolean filled) {
      this.radius = radius;
      this.color = color;
      this.filled = filled;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   @Override
   double getArea() {
      return Math.PI * radius * radius;
   }

   @Override
   double getPerimeter() {
      return Math.PI * radius * 2;
   }

   public String toString() {
      return "Circle [" + super.toString() + ", radius= " + radius + "]";
   }
}
