package on_tap_oop;

public class TestShape {
   public static void main(String[] args) {
      //  Create a object
      Ractangle r1 = new Ractangle(3.4, 5.6, "blue", false);
      Ractangle r2 = new Ractangle();

      System.out.println(r1.toString());
      System.out.println("Color: "+r1.getColor());
      System.out.println("filled: "+r1.isFilled());
      System.out.println("Area: "+r1.getArea());
      System.out.println("Perimeter: "+r1.getPerimeter());

      System.out.println();
      System.out.println(r2.toString());

      Circle c1 = new Circle(3, "yellow", false);

      System.out.println(c1.toString());
      System.out.println("Area: "+c1.getArea());
      System.out.println("Perimeter: "+c1.getPerimeter());
      System.out.println(c1.isFilled());
      System.out.println();

      Square s1 = new Square(5);
      System.out.println(s1.toString());
      System.out.println("Area: "+s1.getArea());
      System.out.println("Perimeter: "+s1.getPerimeter());
      System.out.println(s1.isFilled());
      
   }
}
