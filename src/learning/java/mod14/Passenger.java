package learning.java.mod14;

/**
 * Created by JasonCrane on 5/25/2017.
 * Project JavaPath
 */
public class Passenger implements Comparable {
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }

  public static class RewardProgram {
    private int memberLevel;
    private int memberDays;

    public int getLevel() {
      return memberLevel;
    }
    public void setLevel(int level) {
      this.memberLevel = level;
    }
    public int getMemberDays() {
      return memberDays;
    }
    public void setMemberDays(int days) {
      this.memberDays = days;
    }
  }

  private RewardProgram rewardProgram = new RewardProgram();
  public RewardProgram getRewardProgram() {
    return rewardProgram;
  }
}
