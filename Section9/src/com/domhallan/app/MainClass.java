package com.domhallan.app;

import com.domhallan.model.Vehicle;
import com.domhallan.utility.MyConstants;

public class MainClass {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();
    vehicle.setMake("Acura");
    vehicle.setModel("ILX");
    vehicle.setYear(2016);
    vehicle.setColor("Prestige Grey");
    vehicle.setLicensePlate("ehallan1");
    vehicle.setVin("19UDE2F39GA093106");

    System.out.println(vehicle);
    System.out.println("\n");
    double price = 100.86;
    var total = price * MyConstants.TAX_RATE;
    System.out.println("Total: $" + total);
  }
}
