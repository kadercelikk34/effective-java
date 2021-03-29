package com.effective.java.method;

/**
 * @author kadercelik
 */
class Soda {

  public String brand() {
    return "Soda";
  }
}

class SparklingSoda extends Soda {

  @Override
  public String brand() {
    return "SparklingSoda";
  }
}

class UludagGazoz extends SparklingSoda {

  @Override
  public String brand() {
    return "UludagGazoz";
  }
}

public class Overriding {

  public static void main(String[] args) {
    Soda[] sodas = {new Soda(), new SparklingSoda(), new UludagGazoz()};
    for (Soda s : sodas) {
      System.out.println(s.brand());
    }
  }
}
