package com.domhallan;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    // check if scanner gave a number

    if (scanner.hasNextInt()) {
      int number = scanner.nextInt();
      System.out.println(number);
    } else {
      Logger logger = Logger.getLogger(ExceptionDemo.class.getName());
      logger.log(Level.SEVERE, "Error: input is not a number.");
    }
    int number = scanner.nextInt();
    System.out.println(number);
  }
}
