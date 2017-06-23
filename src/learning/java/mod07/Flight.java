package learning.java.mod07;

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

  public Flight(int flightNumber) {
    this.flightNumber = flightNumber;
  }

  public Flight(char flightClass) {
    this.flightClass = flightClass;
  }
}
