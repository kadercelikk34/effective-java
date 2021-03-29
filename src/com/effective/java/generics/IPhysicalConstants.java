package com.effective.java.generics;

/**
 * @author kadercelik
 */
public enum IPhysicalConstants {
  AVOGADROS_NUMBER(6.985868586),
  ELECTRON_MASS(7.985868586);

  double value;

  IPhysicalConstants(double value) {
    this.value = value;
  }

  public double getValue() {
    return value;
  }

  public static void main(String[] args) {
    System.out.println(IPhysicalConstants.ELECTRON_MASS);
    System.out.println(IPhysicalConstants.ELECTRON_MASS.value);
    System.out.println(IPhysicalConstants.ELECTRON_MASS.getValue());
  }
}
