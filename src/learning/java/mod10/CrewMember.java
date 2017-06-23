package learning.java.mod10;

/**
 * Created by JasonCrane on 5/11/2017.
 * Project JavaPath
 */
public class CrewMember {
  static final int MAX_FAA_SEATS = 550;

  private FlightCrewJob job;

  public CrewMember(FlightCrewJob job) {
    this.job = job;
  }

  public void setJob(FlightCrewJob job) {
    this.job = job;
  }
}
