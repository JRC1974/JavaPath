package learning.java.mod13;

/**
 * Created by JasonCrane on 5/12/2017.
 * Project JavaPath
 */
public class Passenger extends Person implements Comparable<Passenger> {
  private int memberLevel; // 3(1st priority), 2, 1
  private int memberDays;

  public int compareTo(Passenger p) {
    if (memberLevel > p.memberLevel) {
      return -1;
    } else if (memberLevel < p.memberLevel) {
      return 1;
    } else {
      if (memberDays > p.memberDays) {
        return - 1;
      } else if (memberDays < p.memberDays) {
        return 1;
      } else {
        return 0;
      }
    }
  }

  public void setLevelAndDays(int memberLevel, int memberDays) {
    this.memberLevel = memberLevel;
    this.memberDays = memberDays;
  }
}
