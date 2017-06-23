package core.platform.java;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    String s5 = String.format("%#o", 32);
    System.out.println("s5: " +s5);

    String s6 = String.format("%#x", 32);
    System.out.println("s6: " +s6);

    String s7 = String.format("%#X", 32);
    System.out.println("s7: " +s7);

    String s8 = String.format("W:%d X:%d", 5, 235);
    System.out.println("s8: " +s8);

    String s9  = String.format("W:%4d X:%4d", 5, 235);
    String s10 = String.format("Y:%4d Z:%4d", 481, 12);
    System.out.println("s9 : " +s9);
    System.out.println("s10: " +s10);

    String s11 = String.format("W:%04d X:%04d", 5, 235);
    String s12 = String.format("Y:%04d Z:%04d", 481, 12);
    System.out.println("s11: " +s11);
    System.out.println("s12: " +s12);

    String s13 = String.format("W:%-4d X:%-4d", 5, 235);
    String s14 = String.format("Y:%-4d Z:%-4d", 481, 12);
    System.out.println("s13: " +s13);
    System.out.println("s14: " +s14);

    String s15 = String.format("%d", 1234567);
    String s16 = String.format("%,d", 1234567);
    String s17 = String.format("%,.4f", 1234567.0);
    System.out.println("s15: " +s15);
    System.out.println("s16: " +s16);;
    System.out.println("s16: " +s17);;

    String s18 = String.format("%d", 123);
    String s19 = String.format("% d", 123);
    String s20 = String.format("% d", -123);
    String s21 = String.format("%+d", 123);
    String s22 = String.format("%+d", -123);
    String s23 = String.format("%(d", 123);
    String s24 = String.format("%(d", -123);
    String s25 = String.format("% (d", 123);
    System.out.println("s18: " +s18);
    System.out.println("s19: " +s19);
    System.out.println("s20: " +s20);
    System.out.println("s21: " +s21);
    System.out.println("s22: " +s22);
    System.out.println("s23: " +s23);
    System.out.println("s24: " +s24);
    System.out.println("s25: " +s25);

    //Regular Expressions
    String s26 = "apple, apple and orange please";
    String s27 = s26.replaceAll("ple", "ricot");
    String s28 = s26.replaceAll("ple\\b", "ricot");
    System.out.println("s27: " +s27);
    System.out.println("s28: " +s28);

    String s29 = "apple, apple and orange please";
    String[] parts = s29.split("\\b");
    System.out.println("parts[0]: "+parts[0]);
    System.out.println("parts[1]: "+parts[1]);
    System.out.println("parts[2]: "+parts[2]);
    for(String theParts: parts) {
      if(theParts.matches("\\w+")) {
        System.out.println(theParts);
      }
    }

    //Dedicated Regular Expressions - helpful due to regular expression overhead
    //Interface regular expresson - https://regex101.com
    String s30 = "apple, apple and orange please";
    Pattern pattern = Pattern.compile("\\w+");
    Matcher matcher = pattern.matcher(s30);
    while(matcher.find()) {
      System.out.println(matcher.group());
    }
  }
}
