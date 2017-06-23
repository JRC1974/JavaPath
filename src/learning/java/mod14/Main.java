package learning.java.mod14;

import static learning.java.mod14.Flight.resetAllPassengers;
import static learning.java.mod14.Flight.getAllPassengers;

/**
 * Created by JasonCrane on 5/12/2017.
 * Project JavaPath
 */
public class Main {
  public static void main(String[] args) {
    resetAllPassengers();
    System.out.println(Flight.getAllPassengers());

    Flight lax045 = new Flight();
    lax045.add1Passenger();
    lax045.add1Passenger();

    System.out.println(Flight.getAllPassengers());

    Flight slc015 = new Flight();
    slc015.add1Passenger();

    System.out.println(getAllPassengers()); //Don't need to include Flight. because of static import

    Passenger steve = new Passenger();
    steve.setName("Steve");
    steve.getRewardProgram().setLevel(3);
    steve.getRewardProgram().setMemberDays(180);

    Passenger.RewardProgram platinum = new Passenger.RewardProgram();
    platinum.setLevel(3);
    if(steve.getRewardProgram().getLevel() == platinum.getLevel()) {
      System.out.println("Steve is platinum");
    }
  }
}
