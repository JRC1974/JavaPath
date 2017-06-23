package learning.java.mod07;

/**
 * Created by JasonCrane on 5/10/2017.
 * Project JavaPath
 */
final public class Passenger {
  private int freeBags;
  private int checkedBags;
  private double perBagFee;

  public Passenger(int freeBags) {
    this(freeBags > 1 ? 25.0d : 50.0d);

    this.freeBags = freeBags;
  }

  public Passenger(int freeBags, int checkedBags) {
    this(freeBags);
    this.checkedBags = checkedBags;
  }

  private Passenger(double perBagFee) {
    this.perBagFee = perBagFee;
  }

  public int getBagResults() {
    return freeBags;
  }
  public double getBagFeeResult() {
    return perBagFee;
  }
}
