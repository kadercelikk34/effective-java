package com.effective.java.serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author kadercelik
 */
public class Printer {

  public static void main(String[] args) {
    Customer customer = new Customer("John", 25, "Male");
    Customer customer2 = new Customer("Tom", 15, "Male");
    try (FileOutputStream f = new FileOutputStream(new File("test.nsn"));
         ObjectOutputStream o = new ObjectOutputStream(f)) {
      o.writeObject(customer);
      o.writeObject(customer2);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      System.out.println("File not found");
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Error initializing stream");
    }
  }
}
