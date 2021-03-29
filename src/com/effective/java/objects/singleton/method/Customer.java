package com.effective.java.objects.singleton.method;

/**
 * @author kadercelik
 */
public class Customer {

  private static final Customer INSTANCE = new Customer();

  private Customer() {
  }

  public static Customer getInstance() {
    return INSTANCE;
  }

  public void write() {
    System.out.println("write !");
  }

  public static void main(String[] args) {
    Customer customer = Customer.getInstance();
    Customer customer2 = Customer.getInstance();
    System.out.println(customer.hashCode() + " " + customer2.hashCode());
    customer.write();
  }
}
