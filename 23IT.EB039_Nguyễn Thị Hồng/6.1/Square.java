package on_tap_oop;

public class Square extends Ractangle{
   public Square () {
   }

   public Square(double side) {
   }

   public Square(double side, String color, boolean filled) {
      super(side, side,color, filled);
   }

   public double getSide(){
      return this.length;
   }

   public void setWith(double side){
      super.length =length;
      super.width = width;
   }

   public void setLength(double side){
      super.width= width;
      super.length = length;
   }

   @Override
   public String toString() {
      return "Square ["+super.toString()+"]";
   }


}
