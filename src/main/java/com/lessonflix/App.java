package com.lessonflix;

import java.util.ArrayList;
import java.util.List;

public class App {

  private enum DAY_OF_WEEK { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
 
  private static String switchJava14(DAY_OF_WEEK dayOfWeek) {
    return switch (dayOfWeek) {
        case MONDAY:
        case TUESDAY:
        case WEDNESDAY:
        case THURSDAY:
        case FRIDAY:
            yield "Weekday";
        case SATURDAY:
        case SUNDAY:
            yield "Weekend";
    };
}
public static void main(String[] args) {
  List a = new ArrayList<>();
  System.out.println(switchJava14(DAY_OF_WEEK.MONDAY));
}
  
  
}