package com.effective.java.exceptions;

import java.util.logging.Logger;

/**
 * @author kadercelik
 */
public class SeatEmptyState implements State {

  private static final Logger LOGGER = Logger.getLogger(String.valueOf(SeatEmptyState.class));

  private SeatSales seatSales;

  public SeatEmptyState(SeatSales seatSales) {
    this.seatSales = seatSales;
  }

  @Override
  public void observe() {
    LOGGER.info("{} Seat is  Empty, oley !!" + seatSales);
  }
}
