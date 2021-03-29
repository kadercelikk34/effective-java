package com.effective.java.exceptions;

/**
 * @author kadercelik Tüm classlar Object sınıfından türer ama bu açık açık gösterilmez
 */
public class SeatSales {

  private State state;

  public SeatSales() {
    state = new SeatEmptyState(this);
  }

  public SeatSales(State state) {
    this.state = state;
  }

  //Tüm metodlar RuntimeException exception fırlatılır. ama bu açık açık gösterilmez
  // public void timePasses() throws RuntimeException {
  public void timePasses() {
    if (state.getClass().equals(SeatEmptyState.class)) {
      changeStateTo(new SeatIsFullState(this));
    } else {
      changeStateTo(new SeatEmptyState(this));
    }
  }

  public void changeStateTo(State newState) {
    if (newState.getClass().getName().equalsIgnoreCase(this.state.getClass().getName())) {
      throw new IllegalArgumentException("Seat state is same");
    }
    this.state = newState;
  }

  @Override
  public String toString() {
    return "The Seat";
  }

  public void observe() {
    this.state.observe();
  }
}
