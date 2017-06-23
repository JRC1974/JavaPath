package learning.java.mod09;

/**
 * Created by JasonCrane on 5/11/2017.
 * Project JavaPath
 */
public class CargoOnlyPilot extends Pilot {
  @Override
  public boolean canAccept(Flight f) {
    return f.getPassengers() == 0;
  }
}
