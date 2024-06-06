package com.domhallan.main;

import java.util.Arrays;
import java.util.List;

public class ArraysBasics {
  public static void main(String[] args) {
    String[] mobileNumbers = {"3142336655", "3145537765",
        "3149875543"};

    for (String mobileNumber : mobileNumbers) {
      System.out.println("Mobile number: " + mobileNumber);
    }

    System.out.println("Mobile numbers length: " + mobileNumbers.length);

    List<String> nbaTeams = List.of("Los Angeles Lakers",
        "Sacramento Kings", "Golden State Warriors", "Utah Jazz",
        "Los Angeles Clippers", "Chicago Bulls", "Miami Heat",
        "Dallas Mavericks", "New York Knicks", "Philadelphia 76ers",
        "Boston Celtics", "Orlando Magic", "Indiana Pacers",
        "Milwaukee Bucks", "Toronto Raptors",
        "Memphis Grizzles");

    for (String nbaTeam : nbaTeams) {
      System.out.println(nbaTeam);
    }
  }
}

