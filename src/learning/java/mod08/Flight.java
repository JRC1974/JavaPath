package learning.java.mod08;

import learning.java.mod07.Passenger;

/**
 * Created by JasonCrane on 5/11/2017.
 * Project JavaPath
 * Method over-loading example
 */
//public class Flight {
//  private int passengers, seats = 150;
//  private int totalCheckedBags;
//  private int maxCarryOns = seats * 2, totalCarryOnes;
//
//  //Ellipse instead of using [] for array - still processes as an array
//  public void addPassengers(Passenger... list) {
//
//  }
//
//  public void add1Passenger() {
//    if (hasSeating()) {
//      passengers += 1;
//    } else {
//      handleTooMany();
//    }
//  }
//
//  public void add1Passenger(int bags) {
//    if (hasSeating()) {
//      add1Passenger();
//      totalCheckedBags += bags;
//    }
//  }
//
//  public void add1Passenger(Passenger p) {
//    add1Passenger(p.getCheckedBags());
//  }
//  private boolean hasSeating(int count) {
//    return passengers + count <= seats;
//  }
//
//  public void handleTooMany() {
//
//  }
//}
