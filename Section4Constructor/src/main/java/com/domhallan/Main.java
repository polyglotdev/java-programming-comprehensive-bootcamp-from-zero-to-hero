package com.domhallan;

public class Main {
  public static void main(String[] args) {
    Employee elijah = new Employee("Elijah", "Hallan", 200_000,
        3001, "Engineering", "Engineering Manager", "elijah@ibm.com"
        , "3145564432", "5463 N. Park Road", "New York", "NY",
        "10001", "USA");

    System.out.println(elijah.toString());
  }
}
