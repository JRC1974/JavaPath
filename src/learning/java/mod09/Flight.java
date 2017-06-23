package learning.java.mod09;

/**
 * Created by JasonCrane on 5/11/2017.
 * Project JavaPath
 */
public class Flight {
  private int passengers, flightNumber, seats = 150;
  private char flightClass;
  private boolean[] isSeatAvailable;

  //Initialization Block - share code across constructors
  {
    isSeatAvailable = new boolean[seats];
    for(int i = 0; i < seats; i++) {
      isSeatAvailable[i] = true;
    }
  }
  public Flight() {
  }

  public int getPassengers() {
    return passengers;
  }
  @Override
  public boolean equals(Object o) {
    //Access base class of equals method
    if (super.equals(o)) {
      return true;
    }

    if (!(o instanceof Flight)) {
      return false;
    }

    Flight other = (Flight) o;
    return flightNumber == other.flightNumber && flightClass == other.flightClass;
  }

  public Flight(int flightNumber) {
    this.flightNumber = flightNumber;
  }

  public Flight(char flightClass) {
    this.flightClass = flightClass;
  }

  @Override
  public String toString() {
    if (flightNumber > 0) {
      return "Flight #" + flightNumber;
    } else {
      return "Flight Class " +flightClass;
    }
  }
}
