package com.domhallan;

public class Car {
  private String make;
  private String model;
  private int year;
  private String color;
  private int mileage;
  private String licensePlate;
  private String vin;


  public Car(String make, String model, int year, String color, int mileage, String licensePlate, String vin) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
    this.mileage = mileage;
    this.licensePlate = licensePlate;
    this.vin = vin;
  }

  public Car() {

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

  public int getYear() {
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

  public int getMileage() {
    return mileage;
  }

  public void setMileage(int mileage) {
    this.mileage = mileage;
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

  // Print Car Details
  public String printCar() {
    return ("""
        Model: %s
        Make: %s
        Year: %d
        Color: %s
        Mileage: \
        %d
        License: %s
        VIN: %s""").formatted(model, make, year, color, mileage, licensePlate, vin);
  }
}
