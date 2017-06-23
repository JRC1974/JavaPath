package learning.java.mod13;

/**
 * Created by JasonCrane on 5/12/2017.
 * Project JavaPath
 */
public interface MathProcessing {
  String SEPARATOR = " ";
  String getKeyword(); // add
  char getSymbol(); // +
  double doCalculation(double leftVal, double rightVal);

}
