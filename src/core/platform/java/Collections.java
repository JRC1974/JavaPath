package core.platform.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by JasonCrane on 6/26/2017.
 * Project JavaPath
 */
public class Collections {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("Foo");
    list.add("Bar");
    System.out.println("Elements: " +list.size());

    for(Object o:list) {
      System.out.println(o.toString());
    }
    String s = (String)list.get(0);
    System.out.println("s: "+s);

    //Strongly Typed Collection
    ArrayList<String> newList = new ArrayList<>();
    newList.add("newFoo");
    newList.add("newBar");
    for(String tokens:newList) {
      System.out.println("NewList: " +tokens);
    }

    ArrayList<String> list1 = new ArrayList<>();
    list1.add("Foo");
    list1.add("Bar");
    LinkedList<String> list2 = new LinkedList<>();
    list2.add("Baz");
    list2.add("Boo");
    list1.addAll(list2);
    for (String tokens:list1) {
      System.out.println("Tokens: " +tokens);
    }
    list1.removeAll(list2);
    for (String tokens:list1) {
      System.out.println("Tokens from removeAll: " +tokens);
    }

    ArrayList<MyClass> listClass = new ArrayList<>();
    MyClass v1 = new MyClass("v1", "abc");
    MyClass v2 = new MyClass("v2", "abc");
    MyClass v3 = new MyClass("v3", "abc");
    listClass.add(v1);
    listClass.add(v2);
    listClass.add(v3);
    listClass.remove(v3);
    for(MyClass m: listClass) {
      System.out.println(m.getLabel());
    }

    //Lambda Example - simple example
    ArrayList<MyClass> lambdaList = new ArrayList<>();
    MyClass z1 = new MyClass("z1", "abc");
    MyClass z2 = new MyClass("z2", "xyz");
    MyClass z3 = new MyClass("z3", "abc");
    lambdaList.add(z1);
    lambdaList.add(z2);
    lambdaList.add(z3);
    lambdaList.forEach(jay -> System.out.println(jay.getLabel()));
    lambdaList.removeIf(m -> m.getValue().equals("abc"));
    lambdaList.forEach(jay -> System.out.println(jay.getLabel()));

    //Moving between Collections and Arrays
    MyClass[] myArray = {
            new MyClass("val1","abc"),
            new MyClass("val2","xyz"),
            new MyClass("val3","abc")
    };
    Collection<MyClass> listArray = Arrays.asList(myArray);
    listArray.forEach(c -> System.out.println(c.getLabel() + " - " +c.getValue()));

    //TreeSet with Comparable
    TreeSet<MyClass> tree = new TreeSet<>();
    tree.add(new MyClass("2222","ghi"));
    tree.add(new MyClass("3333","abc"));
    tree.add(new MyClass("1111","def"));
    tree.forEach(t -> System.out.println(t));

    //TreeSet with Comparator
    TreeSet<MyClass> treeComparator = new TreeSet<>(new MyComparator());
    treeComparator.add(new MyClass("2222","ghi"));
    treeComparator.add(new MyClass("3333","abc"));
    treeComparator.add(new MyClass("1111","def"));
    treeComparator.forEach(t -> System.out.println(t));

    //Map
    Map<String,String> map = new HashMap<>();
    map.put("2222","ghi");
    map.put("3333","abc");
    map.put("1111","def");
    System.out.println(map.get("3333"));
    System.out.println(map.get("9999"));
    System.out.println(map.getOrDefault("3333", "xyz"));
    System.out.println(map.getOrDefault("9999", "xyz"));

    map.forEach( (k, v) -> System.out.println(k + " | " + v));
    map.replaceAll( (k, v) -> v.toUpperCase());
    map.forEach( (k, v) -> System.out.println(k + " | " + v));

    //Sorted Maps
    SortedMap<String, String> sortMap = new TreeMap<>();
    sortMap.put("2222","ghi");
    sortMap.put("3333","abc");
    sortMap.put("1111","def");
    sortMap.put("6666","xyz");
    sortMap.put("4444","mno");
    sortMap.put("5555","pqr");
    sortMap.forEach( (k, v) -> System.out.println(k + " | " + v));

    SortedMap<String, String> hMap = sortMap.headMap("3333");
    hMap.forEach( (k, v) -> System.out.println(k + " | " + v)); //headMap is exclusive
    System.out.println("====");
    SortedMap<String, String> tMap = sortMap.tailMap("3333");
    tMap.forEach( (k, v) -> System.out.println(k + " | " + v)); //tailMap is inclusive

  }
}
