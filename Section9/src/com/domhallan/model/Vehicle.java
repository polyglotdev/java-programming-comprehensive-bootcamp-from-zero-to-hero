package com.domhallan.model;

public class Vehicle {
  private String make;
  private String model;
  private int year;
  private String color;
  private String licensePlate;
  private String vin;

  public Vehicle() {

  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear(int year) {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public int getYear() {
    return year;
  }


  @Override
  public String toString() {
    return "Year: " + year +
           "\nMake: " + make +
           "\nModel: " + model +
           "\nColor: " + color +
           "\nLicense Plate: " + licensePlate +
           "\nVIN: " + vin;
  }
}
