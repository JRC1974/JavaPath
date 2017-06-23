package learning.java.mod14;

/**
 * Created by JasonCrane on 5/12/2017.
 * Project JavaPath
 */
public class Flight {
  int passengers;
  void add1Passenger() {
    passengers += 1;
    allPassengers += 1;
  }

  static int allPassengers;
  static int getAllPassengers() {
    return allPassengers;
  }
  static void resetAllPassengers() {
    allPassengers = 0;
  }
}
