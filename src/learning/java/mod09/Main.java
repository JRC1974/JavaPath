package learning.java.mod09;

import learning.java.mod07.Passenger;

/**
 * Created by JasonCrane on 5/11/2017.
 * Project JavaPath
 */
public class Main {
  public static void main(String [] args) {
//    CargoFlight cf = new CargoFlight();
//    CargoFlight cf2 = new CargoFlight(124);
//
//    cf.add1Package(1.0f, 2.5f, 3.0f);
//    Passenger jane = new Passenger(0,2);

    System.out.println("Using Inheritance");
    CalculateBase[] calculators = {
            new Divider(100.0d, 50.0d),
            new Adder(25.0d, 92.0d),
            new Subtracter(225.0d, 17.0d),
            new Multiplier(11.0d, 3.0d)
    };

    for (CalculateBase calculator : calculators) {
      calculator.calculate();
      System.out.println("Result: " + calculator.getResult());
    }
  }
}
