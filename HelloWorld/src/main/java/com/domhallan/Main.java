package com.domhallan;

public class Main {
  public static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld();
    helloWorld.setName("Elijah");
    var greet = helloWorld.sayHello();
    System.out.println(greet);
  }
}
