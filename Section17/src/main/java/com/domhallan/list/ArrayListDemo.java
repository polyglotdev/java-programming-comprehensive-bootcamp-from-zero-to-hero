package com.domhallan.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("world");
    System.out.println(list);

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(100);
    numbers.add(200);
    numbers.add(300);
    var total = 0;
    for (Integer number : numbers) {
      total += number;
    }
    System.out.println(total);

    List<String> countryNames = getStrings();
    System.out.println("countryNames has " + countryNames.size() +
                       " countries in list");

    for (String countryName : countryNames) {
      System.out.println(countryName);
    }
  }

  private static List<String> getStrings() {
    List<String> countryNames = new ArrayList<>();
    countryNames.add("United States of America");
    countryNames.add("Canada");
    countryNames.add("Mexico");
    countryNames.add("Brazil");
    countryNames.add("Argentina");
    countryNames.add("Chile");
    countryNames.add("Peru");
    countryNames.add("Colombia");
    countryNames.add("Venezuela");
    countryNames.add("Uruguay");
    countryNames.add("Paraguay");
    countryNames.add("Ecuador");
    countryNames.add("Bolivia");
    countryNames.add("Guyana");
    return countryNames;
  }
}
