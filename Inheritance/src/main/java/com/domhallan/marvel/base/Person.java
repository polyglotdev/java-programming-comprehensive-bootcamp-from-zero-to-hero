package com.domhallan.marvel.base;

public class Person {
  public String name;
  public int age;


  public void eat(String food) {
    System.out.println("Person is eating " + food);
  }

  public void walk() {
    System.out.println("Person is walking");
  }

  public void sleep() {
    System.out.println("Person is sleeping");
  }
}
