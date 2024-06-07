package com.domhallan.marvel.base;

public class Person {
  public String name;
  public int age;
  public static int numberOfHands = 2;

  public void calculateAge(int year){
    System.out.println("Person's age is " + (2024 - year) + " years" +
                       " old.");
  }

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
