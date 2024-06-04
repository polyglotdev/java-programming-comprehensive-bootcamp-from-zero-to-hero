package com.domhallan;

public class StringPoolDemo {
  public static void main(String[] args) {
    String hello = "hello";
    String hi = "hello";
    String hey = "hey";

    printHashCode(hello, "hello");
    printHashCode(hi, "hello");
    printHashCode(hey, "hey");
  }

  public static void printHashCode(String varName, String str) {
    int hashCode = str.hashCode();
    System.out.printf("The hash code for variable %s with value \"%s\" is: %d\n", varName, str, hashCode);
  }
}
