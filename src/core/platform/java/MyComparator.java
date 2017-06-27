package core.platform.java;

import java.util.Comparator;

/**
 * Created by JasonCrane on 6/27/2017.
 * Project JavaPath
 */
public class MyComparator implements Comparator<MyClass> {
  public int compare(MyClass x, MyClass y) {
    return x.getLabel().compareToIgnoreCase(y.getLabel());
  }
}
