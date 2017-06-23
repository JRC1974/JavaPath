package core.platform.java;

/**
 * Created by JasonCrane on 6/23/2017.
 * Project JavaPath
 */
public class Formatter {
  public static void main(String[] args) {
    int david = 13, dawson = 11, dillon = 4, gordon = 2;

    String s1 = "My nephews are " + david + ", " +
            dawson + ", " +
            dillon + ", and " +
            gordon + " years old";
    System.out.println("s1: " +s1);

    String s2 = String.format("My nephews are %d, %d, %d, and %d years old", david, dawson, dillon, gordon);
    System.out.println("s2: " +s2);

    double avgDiff = ((david - dawson) + (dawson - dillon) + (dillon - gordon)) / 3.0d;
    String s3 = "The average age between each is " +avgDiff + " years";
    System.out.println("s3: " +s3);

    String s4 = String.format("The average age between each is %.1f years",avgDiff);
    System.out.println("s4: " +s4);


  }
}
