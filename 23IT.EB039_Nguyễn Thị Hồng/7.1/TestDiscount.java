package Discount;

import java.util.Date;

public class TestDiscount {
   public static void main(String[] args) {
      Customer customer = new Customer("peter", false, "Premium");
      Customer customer2 = new Customer("Hana", false, "Silver");
      // test toString()
      System.out.println(customer.toString());
      System.out.println(customer2.toString());
      System.out.println();

      Visit visit = new Visit(customer, new Date());
      System.out.println(visit);
      System.out.println();

      visit.setProductExpense(4.5);
      visit.setServiceExpense(9.8);
      visit.setProductExpense(2);
      System.out.println(visit.toString());

      System.out.println("Total by " + visit.getCustomerName() +" : "+ visit.getTotalExpense());
   }
}
