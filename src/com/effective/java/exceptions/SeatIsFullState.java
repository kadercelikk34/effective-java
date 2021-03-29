package com.effective.java.exceptions;

import java.util.logging.Logger;

/**
 * @author kadercelik
 */
public class SeatIsFullState implements State {

  private static final Logger LOGGER = Logger.getLogger(String.valueOf(SeatIsFullState.class));

  private SeatSales seatSales;

  public SeatIsFullState(SeatSales seatSales) {
    this.seatSales = seatSales;
  }

  @Override
  public void observe() {
    LOGGER.info("{} Seat is  Full, sory !!" + seatSales);
  }
}
