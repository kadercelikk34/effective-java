package com.effective.java.objects.singleton.enumoration;

/**
 * @author kadercelik
 */
public enum Customer {
  INSTANCE;

  public void write() {
    System.out.println("write !");
  }

  public static void main(String[] args) {
    Customer customer = Customer.INSTANCE;
    Customer customer2 = Customer.INSTANCE;
    System.out.println(customer.hashCode() + " " + customer2.hashCode());
    customer.write();
  }
}
