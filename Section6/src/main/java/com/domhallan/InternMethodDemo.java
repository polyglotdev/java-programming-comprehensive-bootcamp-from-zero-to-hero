package com.domhallan;

public class InternMethodDemo {
  public static void main(String[] args) {
    String hello = "Hello";
    String obj = new String("Hello").intern();
    System.out.println(hello.equals(obj));
  }
}
