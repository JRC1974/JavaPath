package learning.java.mod09;

/**
 * Created by JasonCrane on 5/11/2017.
 * Project JavaPath
 */
public abstract class Pilot {
  private Flight currentFlight;

  public void fly(Flight f) {
    if (canAccept(f)) {
      currentFlight = f;
    } else {
      handleCantAccept();
    }
  }

  public abstract boolean canAccept(Flight f);

  private void handleCantAccept() {
    System.out.println("Can't accept");
  }
}
