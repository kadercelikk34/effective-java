package com.effective.java.generics;

/**
 * @author kadercelik
 */
public class Point {

  //final kullandığımız için  setter metod kullanımını engelledik ilk değerleri yapılandırıcı içinde verilir.
  //Eğer classı final yaparsak bu class türetilemez.
  private final double x;

  private final double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
}
