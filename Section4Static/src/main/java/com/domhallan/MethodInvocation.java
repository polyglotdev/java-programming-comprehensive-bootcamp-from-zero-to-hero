package com.domhallan;

public class MethodInvocation {

  public static void main(String[] args) {
    MethodInvocation demoObj = new MethodInvocation();
    demoObj.method1();
  }

  public void method1() {
    int number = 10;
    System.out.println("Method 1");
    String output = method2();
    System.out.println(output);
  }

  public String method2() {
    String output = "Hello World";
    System.out.println("Method 2");
    method3("Hi");
    return output;
  }

  public void method3(String input) {
    System.out.println(input);
    System.out.println("Method 3");
    method4(10);
  }

  public void method4(int num) {
    MethodInvocation demoObj = new MethodInvocation();
    System.out.println(num);
    System.out.println("Method 4");
  }

}
