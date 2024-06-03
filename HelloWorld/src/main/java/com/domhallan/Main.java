package com.domhallan;

public class Main {
  public static void main(String[] args) {
    HelloWorld helloWorld = new HelloWorld();
    helloWorld.setName("Elijah");
    var greet = helloWorld.sayHello();
    System.out.println(greet);

    // Add Joke
    Joke joke = new Joke("Why did the chicken cross the road?");
    System.out.println(joke.getJoke());

    joke.setJokeResponse("To get to the other side!");
    System.out.println(joke.getJokeResponse());
  }
}
