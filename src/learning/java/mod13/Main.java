package learning.java.mod13;

import java.util.Arrays;

/**
 * Created by JasonCrane on 5/12/2017.
 * Project JavaPath
 */
public class Main {
  public static void main(String[] args) {
    System.out.println("Interface Test");

    Passenger bob = new Passenger();
    bob.setLevelAndDays(1, 180);
    Passenger jane = new Passenger();
    jane.setLevelAndDays(1,90);
    Passenger steve = new Passenger();
    steve.setLevelAndDays(2,180);
    Passenger lisa = new Passenger();
    lisa.setLevelAndDays(3,730);

    Passenger[] passengers = {bob, jane, steve, lisa};
    Arrays.sort(passengers);

    String[] statements = {
            "add 25.0 92.0",
            "power 5.0 2.0"
    };

    DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
            new Adder(),
            new PowerOf()
    });
    for(String statement:statements) {
      String output = helper.process(statement);
      System.out.println(output);
    }
  }
}
