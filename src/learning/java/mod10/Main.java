package learning.java.mod10;

import learning.java.mod11.InvalidStatementException;

/**
 * Created by JasonCrane on 5/11/2017.
 * Project JavaPath
 */
public class Main {
  public static void main(String[] args) {
//    System.out.println("String Equality Section");
//    String s1 = "I Love";
//    s1 += " Java";
//
//    String s2 = "I";
//    s2 += " Love Java";
//
//    if(s1 == s2) {
//      System.out.println("s1 == s2");
//    }
//
//    if (s1.equals(s2)) {
//      System.out.println("s1.equals(s2)");
//    }
//
//    //Reference comparison inexpensive; character by character comparison very expensive
//    String s3 = s1.intern();
//    String s4 = s2.intern();
//    if (s3 == s4) {
//      System.out.println("s3 == s4");
//    }
//
//    System.out.println("");
//    System.out.println("Converting Non-String Types to String");
//    int iVal = 100;
//    String sVal = String.valueOf(iVal);
//
//    Flight myFlight = new Flight(175);
//    System.out.println("My flight is " +myFlight);
//
//    System.out.println("");
//    System.out.println("StringBuilder");
//    //Best performance if pre-size buffer, but will grow automatically if needed
//    StringBuilder sb = new StringBuilder(40);
//    System.out.println("Sb capacity: " +sb.capacity());
//    String location = "Florida";
//    sb.append("I flew to ");
//    sb.append(location);
//    sb.append(" on ");
//    sb.append(myFlight);
//    System.out.println(sb.toString());
//
//    int time = 9;
//    int pos = sb.length() - " on ".length() - myFlight.toString().length();
//    sb.insert(pos, " at ");
//    sb.insert(pos + 4, time);
//    String message = sb.toString();
//    System.out.println("Message: " +message);
//
//    System.out.println("");
//    System.out.println("Classes vs. Primitives");
//    //Classes provide convenience with overhead cost where primitives provide efficiency
//    //Wrapper Class
//    Integer a = 100;
//    int b = a;
//    Integer c = b;
//    Integer d = Integer.valueOf(100);
//    int e = d.intValue();
//    Integer f = Integer.valueOf(e);
//    String s = "87.44";
//    double s5 = Double.parseDouble(s);
//
//    System.out.println("");
//    System.out.println("Final Fields/Enums");
//    CrewMember judy = new CrewMember(FlightCrewJob.CoPilot);
//    judy.setJob(FlightCrewJob.Pilot);

    System.out.println("");
    System.out.println("Calc Engine with More Data Type and Enum Use");
    String[] statements = {
            "addx 23.0",
            "add xx 21.0",
            "divide 100.0 50.0",
            "add 25.0 92.0",
            "subtract 225.0 17.0",
            "multiply 11.0 3.0"
    };
    CalculateHelper helper = new CalculateHelper();
    for(String statement: statements) {
      try {
        helper.process(statement);
        System.out.println("Helper: " + helper);
      } catch(InvalidStatementException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
