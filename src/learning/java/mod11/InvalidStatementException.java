package learning.java.mod11;

/**
 * Created by JasonCrane on 5/12/2017.
 * Project JavaPath
 */
public class InvalidStatementException extends Exception {
  public InvalidStatementException(String reason, String statement) {
    super(reason + ": " + statement);
  }

  public InvalidStatementException(String reason, String statement, Throwable cause) {
    super(reason + ": " + statement, cause);
  }
}
