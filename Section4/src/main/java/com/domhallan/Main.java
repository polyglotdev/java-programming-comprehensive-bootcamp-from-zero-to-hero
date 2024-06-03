package com.domhallan;

public class Main {
  public static void main(String[] args) {
    Person elijah = new Person("Elijah Hallan", 25, "Male", "USA",
        "Software Engineer");

    System.out.println(elijah.getName());
    System.out.println(elijah.getAge());
    System.out.println(elijah.getGender());
    System.out.println(elijah.getNationality());
    System.out.println(elijah.getCareer());
    System.out.println("\n");
    // Ezra
    Person ezra = new Person("Ezra Hallan", 25, "Male", "USA",
        "Software Engineer");
    System.out.println("Name: " + ezra.getName());
    System.out.println("Ezra age: " + ezra.getAge());
    System.out.println("Ezra gender: " + ezra.getGender());
    System.out.println("Ezra nationality: " + ezra.getNationality());
    System.out.println("Ezra career: " + ezra.getCareer());

    System.out.println("\n");

    // New Car
    Car nissanMaxima = new Car("Nissan", "Maxima", 1997, "Black",
        300_000
        , "xdh-77564", "JN8AZ08T73W611061");
    System.out.println("VIN: " + nissanMaxima.getVin());
    System.out.println("Year: " + nissanMaxima.getYear());
    System.out.println("Automaker: " + nissanMaxima.getMake());
    System.out.println("Model: " + nissanMaxima.getModel());
    System.out.println("Color: " + nissanMaxima.getColor());
    System.out.println("Mileage: " + nissanMaxima.getMileage());
    System.out.println("License Plate: " + nissanMaxima.getLicensePlate());

    nissanMaxima.setYear(2000);
    System.out.println("New Year: " + nissanMaxima.getYear());

    System.out.println("\n");

    Person chandler = new Person();
    chandler.setName("Chandler Prince");
    chandler.setAge(25);
    chandler.setGender("Male");
    chandler.setNationality("Canada");
    chandler.setCareer("Cyber Security Analyst");
    System.out.println(chandler);

    System.out.println("\n");

    Car ferrari = new Car();
    ferrari.setVin("ZFFWL44A330131232");
    ferrari.setMake("Ferrari");
    ferrari.setModel("456M");
    ferrari.setYear(2003);
    ferrari.setColor("Red");
    ferrari.setMileage(0);
    ferrari.setLicensePlate("domh1");
    System.out.println(ferrari.printCar());
  }
}
