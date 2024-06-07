package com.domhallan;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayOutOfBounds {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number between 0 and 10:");
    int userNumber = scanner.nextInt();

    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = i;
    }

    Random random = new Random();
    int randomIndex = random.nextInt(10);
    int randomNum = numbers[randomIndex];

    if (userNumber == randomNum) {
      System.out.println("Congratulations! Your number: " + userNumber + " matched the randomly selected number.");
    } else {
      Logger logger = Logger.getLogger(ExceptionDemo.class.getName());
      logger.log(Level.SEVERE, "User number " + userNumber + " does not match selected number.");
    }

  }
}
