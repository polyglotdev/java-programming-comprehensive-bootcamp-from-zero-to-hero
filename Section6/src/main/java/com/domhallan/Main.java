package com.domhallan;

public class Main {
  public static void main(String[] args) {
    String greeting  = "Hello, world!";
    System.out.println("Strings");
    System.out.println("Length of greeting: " + greeting.length());

    String name = "Elijah Hallan";
    String greetPerson = String.format("Hello, %s!", name);
    System.out.println(greetPerson);

    Object obj = new Object();
    System.out.println(obj.hashCode());
    System.out.println(Integer.toHexString(obj.hashCode()));

    Object obj2 = new Object();
    System.out.println("obj == obj2: " + (obj.equals(obj2)));

    Object obj3 = obj;
    System.out.println("obj == obj3: " + (obj.equals(obj3)));
  }
}
