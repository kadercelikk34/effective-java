package com.effective.java.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author kadercelik
 * oi.readObject() bilmediğimiz bir objeyi böyle okumak çok risklidir bunun yerine
 * json tabanlı bir yapı kullanmak daha güvenilirdir.
 */
public class Reader {

  public static void main(String[] args) {
    try (FileInputStream fi = new FileInputStream("test.nsn");
         ObjectInputStream oi = new ObjectInputStream(fi)) {
      Object object = oi.readObject();
      //
      Customer customer = (Customer) object;
      System.out.println(customer);
      Customer customer2 = (Customer) object;
      System.out.println(customer2);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
