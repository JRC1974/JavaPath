package learning.java.mod13;

import java.util.Iterator;

/**
 * Created by JasonCrane on 5/12/2017.
 * Project JavaPath
 */
public class Flight implements Comparable<Flight>, Iterable<Person> {
  private int flightTime;
  private CrewMember[] crew;
  private Passenger[] roster;
  public int compareTo(Flight f) {
    return flightTime - f.flightTime;
  }
  public Iterator<Person> iterator() {
    return new FlightIterator(crew,roster);
  }
}
