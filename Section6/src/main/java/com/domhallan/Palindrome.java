package com.domhallan;

public class Palindrome {
  public static void main(String[] args) {
    String str = "racecar";
    //Use of the method
    boolean isPalindrome = isPalindrome(str);
    System.out.println("Is the string a Palindrome: " + isPalindrome);
  }

  public static boolean isPalindrome(String str) {
    StringBuilder strReverse = new StringBuilder(str);
    strReverse.reverse();
    return strReverse.toString().equals(str);
  }
}
