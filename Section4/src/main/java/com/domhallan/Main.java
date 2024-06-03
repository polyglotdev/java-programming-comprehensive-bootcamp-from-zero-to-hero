package com.domhallan;

public class Main {
  public static void main(String[] args) {
    Person person = new Person("Elijah Hallan", 25, "Male", "USA",
        "Software Engineer");

    System.out.println(person.getName());
    System.out.println(person.getAge());
    System.out.println(person.getGender());
    System.out.println(person.getNationality());
    System.out.println(person.getCareer());
    System.out.println(person.toString());
  }
}
