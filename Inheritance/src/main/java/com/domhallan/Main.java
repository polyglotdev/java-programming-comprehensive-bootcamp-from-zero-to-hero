package com.domhallan;

import com.domhallan.marvel.heros.CaptainAmerica;
import com.domhallan.marvel.heros.IronMan;

public class Main {
  public static void main(String[] args) {
    CaptainAmerica captainAmerica = new CaptainAmerica();
    captainAmerica.usePower();

    captainAmerica.eat("burger");
    captainAmerica.walk();
    captainAmerica.sleep();
    captainAmerica.age = 100;

    System.out.println("Captain America's age is " + captainAmerica.age + " years old.");

    IronMan ironMan = new IronMan();
    ironMan.usePower();
    ironMan.eat("pizza");
    ironMan.walk();
    ironMan.sleep();
    ironMan.age = 50;

    System.out.println("Iron Man is " + ironMan.age + " years old.");
  }
}
