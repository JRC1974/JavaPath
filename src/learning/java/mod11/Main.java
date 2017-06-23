package learning.java.mod11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by JasonCrane on 5/11/2017.
 * Project JavaPath
 */
public class Main{
  public static void main(String[] args) {
//    int i = 12;
//    int j = 2;
//
//    try {
//      int result = i / (j - 2);
//      System.out.println("result: " +result);
//    } catch(Exception e) {
//      System.out.println("Error: " +e.getMessage());
//      e.printStackTrace();
//    }

    BufferedReader reader = null;
    int total = 0;
    try {
      reader = new BufferedReader(new FileReader("C:\\Users\\JasonCrane\\IdeaProjects\\JavaPath\\src\\learning\\java\\mod11\\Numbers.txt"));
      String line = null;
      while ((line = reader.readLine()) != null) {
        total += Integer.valueOf(line);
      }
      System.out.println("Total: " +total);
    } catch(NumberFormatException e) {
      System.out.println("Invalid value: " + e.getMessage());
    } catch(FileNotFoundException e) {
      System.out.println("Not found: " +e.getMessage());
    } catch(IOException e) {
      System.out.println("Error interacting with file: " +e.getMessage());
    } finally {
      try {
        if (reader != null) {
          System.out.println("Closing file");
          reader.close();
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
