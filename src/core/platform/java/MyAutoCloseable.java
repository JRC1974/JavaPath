package core.platform.java;

import java.io.IOException;

/**
 * Created by JasonCrane on 5/25/2017.
 * Project JavaPath
 */
public class MyAutoCloseable implements AutoCloseable {
  public void saySomething() throws IOException {
    throw new IOException("Exception from saySomething");
    //System.out.println("Something");
  }

  @Override
  public void close() throws IOException {
    throw new IOException("Exception from close");
    //System.out.println("Close");
  }
}
