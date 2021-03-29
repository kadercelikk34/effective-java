package com.effective.java.interfaces;

/**
 * @author kadercelik
 */
public class Triangle implements Shape {

  private double weight;

  private double height;

  public Triangle(double weight, double height) {
    this.weight = weight;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return (weight * height) / 2;
  }
}
