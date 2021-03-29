package com.effective.java.objects.builder;

/**
 * @author kadercelik
 */
public class Customer {

  private final String name; //optional

  private final String lastName;//optional

  private final String email; //required

  private final String phoneNumber;//required

  public static class Builder {

    //Optional parameters - initialized to defaul tvalues
    private String name = "";

    private String lastName = "";

    //Required parameters
    private final String email;

    private final String phoneNumber;

    public Builder(String email, String phoneNumber) {
      this.email = email;
      this.phoneNumber = phoneNumber;
    }

    public Builder name(String value) {
      name = value;
      return this;
    }

    public Builder lastName(String value) {
      lastName = value;
      return this;
    }

    public Customer build() {
      return new Customer(this);
    }
  }

  public Customer(Builder builder) {
    name = builder.name;
    lastName = builder.lastName;
    email = builder.email;
    phoneNumber = builder.phoneNumber;
  }

  public static void main(String[] args) {
    Customer customer = new Customer.Builder("test@gmail.com", "000000000")
        .name("kader").lastName("Çelik").build();
    System.out.println("Customer : " + customer);
  }
}
