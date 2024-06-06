package com.domhallan.main;

import java.util.Arrays;

public class ArraysBasics {
  public static void main(String[] args) {
    String[] mobileNumbers = {"3142336655", "3145537765",
        "3149875543"};

    for (String mobileNumber : mobileNumbers) {
      System.out.println("Mobile number: " + mobileNumber);
    }
  }
}

