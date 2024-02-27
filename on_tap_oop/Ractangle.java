package on_tap_oop;

public class Ractangle extends Shape {
   protected double width;
   protected double length;

   public Ractangle() {
      this.width = 1.0;
      this.length = 1.0;
   }

   public Ractangle(double width, double length) {
      this.width = width;
      this.length = length;
   }

   public Ractangle(double width, double length, String color, boolean filled) {
      super(color, filled);
      this.width = width;
      this.length = length;
   }

   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getLength() {
      return length;
   }

   public void setLength(double length) {
      this.length = length;
   }

   @Override
   double getArea() {
      return (length * width);
   }

   @Override
   double getPerimeter() {
      return 2 * (length + width);
   }

   public String toString() {
      return "Rectangle[ " + super.toString() + ", width=" + width + ", length=" + length + "]";

   }
}
