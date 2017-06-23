package learning.java.mod13;

import learning.java.mod09.CalculateBase;

/**
 * Created by JasonCrane on 5/12/2017.
 * Project JavaPath
 */
public class Adder extends CalculateBase implements MathProcessing {
  @Override
  public String getKeyword() {
    return "add";
  }

  @Override
  public char getSymbol() {
    return '+';
  }

  @Override
  public double doCalculation(double leftVal, double rightVal) {
    setLeftVal(leftVal);
    setRightVal(rightVal);
    calculate();

    return getResult();
  }

  @Override
  public void calculate() {
    double value = getLeftVal() + getRightVal();
    setResult(value);
  }
}
