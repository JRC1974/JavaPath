package core.platform.java;

/**
 * Created by JasonCrane on 6/26/2017.
 * Project JavaPath
 */
public class MyClass implements Comparable<MyClass>{
  String label, value;

  public MyClass(String label, String value) {
    this.label = label;
    this.value = value;
  }

  public String getLabel() {
    return label;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return label + " | " + value;
  }

  @Override
  public boolean equals(Object o) {
    MyClass other = (MyClass) o;
    return value.equalsIgnoreCase(other.value);
  }

  @Override
  public int compareTo(MyClass other) {
    return value.compareToIgnoreCase(other.value);
  }
}