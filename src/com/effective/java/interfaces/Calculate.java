package com.effective.java.interfaces;

/**
 * @author kadercelik
 */
public class Calculate {

  public static void main(String[] args) {
    Circle circle = new Circle(4);
    System.out.println("circle : " + circle.calculateArea());
    //
    Triangle triangle = new Triangle(6, 8);
    System.out.println("triangle : " + triangle.calculateArea());
  }
}
