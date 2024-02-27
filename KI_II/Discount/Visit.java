package Discount;

import java.util.Date;

public class Visit extends Customer{

   private Customer customer;
   private Date date;
   private double serviceExpense;
   private double productExpense;

   public Visit(Customer customer, Date date) {
      this.customer = customer;
      this.date = date;
   }

   public String getCustomerName() {
      return customer.getName();
   }

   public double getServiceExpense() {
      return serviceExpense;
   }

   public void setServiceExpense(double serviceExpense) {
      this.serviceExpense = this.serviceExpense + serviceExpense;
   }

   public double getProductExpense() {
      return productExpense;
   }

   public void setProductExpense(double productExpense) {
      this.productExpense = this.productExpense + productExpense;
   }

   public double getTotalExpense() {
      return (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getNumberType()))) +
               (productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getNumberType()))) ;
   }
   
   public String toString() {
      return "Visit{Customer name = "+ customer.getName()+
      "\nCustomer member = "+ customer.isMember() +
      "\nCustomer member type = "+ customer.getNumberType()+
      "\nDate = " + date+
      "\nServiceExpense = "+ serviceExpense +
      "\nProductExpense = "+productExpense+"}";
   }
}
