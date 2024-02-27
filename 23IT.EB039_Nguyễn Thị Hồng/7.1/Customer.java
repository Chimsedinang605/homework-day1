package Discount;
public class Customer {
   private String name;
   private boolean member;
   private String numberType;

   public Customer() {
      this.member = false;
   }

   public Customer(String name, boolean member, String numberType) {
      this.name = name;
      this.member = member;
      this.numberType = numberType;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public boolean isMember() {
      return member;
   }

   public void setMember(boolean member) {
      this.member = member;
   }

   public String getNumberType() {
      return numberType;
   }

   public void setNumberType(String numberType) {
      this.numberType = numberType;
   }

   @Override
   public String toString() {
      return "Customer [name=" + name + ", member=" + member + ", numberType=" + numberType + "]";
   }

   
}
