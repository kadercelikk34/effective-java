package com.effective.java.generics;

import java.math.BigDecimal;

/**
 * @author kadercelik
 */
public class Candy {

  public static void main(String[] args) {
    // para ve mmuhasebesel işlerde bBig decimal kullanmak gerekir.
    //double money = 1.00;
    BigDecimal money = BigDecimal.valueOf(1.00);
    int sugar = 0;
    for (BigDecimal price = new BigDecimal("10");
        money.compareTo(price) >= 0;
        price = price.add(new BigDecimal("0.10"))) {
      money = money.subtract(price);
      sugar++;
    }
    System.out.println(sugar + " buy sugar");
    System.out.println("remaining money " + money + " buy sugar");
  }
}
