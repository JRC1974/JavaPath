package learning.java.mod09;

/**
 * Created by JasonCrane on 5/11/2017.
 * Project JavaPath
 */
public class Multiplier extends CalculateBase {
  public Multiplier() {

  }
  public Multiplier(double leftVal, double rightVal) {
    super(leftVal,rightVal);
  }

  @Override
  public void calculate() {
    double value = getLeftVal() * getRightVal();
    setResult(value);
  }
}