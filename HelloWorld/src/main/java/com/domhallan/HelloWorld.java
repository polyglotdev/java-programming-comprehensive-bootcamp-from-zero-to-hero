package com.domhallan;

public class HelloWorld {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String sayHello() {
    return String.format("Hello, %s!", name);
  }
}
