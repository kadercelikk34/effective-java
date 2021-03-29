package com.effective.java.exceptions;

/**
 * @author kadercelik
 */
public class SeatSalesApp {

  public static void main(String[] args) {
    SeatSales seatSales = new SeatSales();
    seatSales.observe();
    seatSales.timePasses();
    seatSales.changeStateTo(new SeatIsFullState(seatSales));
    seatSales.observe();
    seatSales.timePasses();
    seatSales.observe();
  }
}
