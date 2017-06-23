package learning.java.mod13;

/**
 * Created by JasonCrane on 5/12/2017.
 * Project JavaPath
 */
public class PowerOf implements MathProcessing {
  @Override
  public String getKeyword() {
    return "power";
  }

  @Override
  public char getSymbol() {
    return '^';
  }

  @Override
  public double doCalculation(double leftVal, double rightVal) {
    return Math.pow(leftVal, rightVal);
  }
}
