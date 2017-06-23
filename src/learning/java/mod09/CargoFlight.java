package learning.java.mod09;

/**
 * Created by JasonCrane on 5/11/2017.
 * Project JavaPath
 */
public class CargoFlight extends Flight {
  float maxCargoSpace = 1000.0f;
  float usedCargoSpace;

  public CargoFlight() {

  }

  public CargoFlight(int flightNumber) {
    super(flightNumber);
  }

  public CargoFlight(int flightNumber, float maxCargoSpace) {
    this(flightNumber);
    this.maxCargoSpace = maxCargoSpace;
  }

  //final doesn't allow method override
  final public void add1Package(float h, float w, float d) {
    float size = h * w * d;
    if (hasCargoSpace(size)) {
      usedCargoSpace += size;
    } else {
      handleNoSpace();
    }
  }

  private boolean hasCargoSpace(float size) {
    return usedCargoSpace + size <= maxCargoSpace;
  }

  private void handleNoSpace() {
    System.out.println("Not enough space");
  }
}
