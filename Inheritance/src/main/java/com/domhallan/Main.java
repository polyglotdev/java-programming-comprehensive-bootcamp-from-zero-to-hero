package com.domhallan;

import com.domhallan.marvel.heros.CaptainAmerica;

public class Main {
  public static void main(String[] args) {
    CaptainAmerica captainAmerica = new CaptainAmerica();
    captainAmerica.usePower();

    captainAmerica.eat("burger");
    captainAmerica.walk();
    captainAmerica.sleep();
    captainAmerica.age = 100;

    System.out.println("Captain America's age is " + captainAmerica.age);
  }
}
