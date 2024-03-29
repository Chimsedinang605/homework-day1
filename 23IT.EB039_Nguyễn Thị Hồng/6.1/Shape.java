package on_tap_oop;
// abstrac class
public abstract class Shape {
   protected String color;
   protected Boolean filled;

   public Shape() {
      this.color = "red";
      this.filled = true;
   }

   public Shape(String color, Boolean filled) {
      this.color = color;
      this.filled = filled;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public boolean isFilled() {
      return filled;
   }

   public void setFilled(boolean filled) {
      this.filled = filled;
   }
// Abstrac method
   abstract double getArea();
   abstract double getPerimeter();

   public String toString() {
      return "Shape[color= "+ color + ", filled= "+ filled+"]";
   }

}
