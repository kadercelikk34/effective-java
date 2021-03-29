package com.effective.java.method;

import java.util.ArrayList;
import java.util.List;

import static com.effective.java.method.Cheese.EZINE;
import static java.util.Collections.emptyList;

/**
 * @author kadercelik
 */
public class CheeseFactory {

  private static final List<Cheese> cheeses = new ArrayList<>();

  static {
    cheeses.add(EZINE);
  }

  /**
   * metod null olarak return edersek main içerisinde listenin null olup olmadığını kontrol etmek gerekir. Runtime da
   * null pointer exection hatası almamak için null return etmemek daha güvenilirdir.
   *
   * @return
   */
  public static List<Cheese> getCheeses() {
    if (cheeses.isEmpty()) {
      //return null;
      return emptyList();
    }
    return cheeses;
  }

  public static void main(String[] args) {
    List<Cheese> cheeses = CheeseFactory.getCheeses();
    if (cheeses.contains(EZINE)) {
      System.out.println("cheese");
    }
  }
}
