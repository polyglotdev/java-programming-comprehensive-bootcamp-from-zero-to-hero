package com.domhallan;

public class Main {
  public static void main(String[] args) {
    boolean b = false;
    if (b) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    String name = "Elijah";
    var greeting = String.format("%s is my name!", name);
    System.out.println(greeting);
  }
}
