package com.domhallan;

public class Employee {

  private String firstName;
  private String lastName;
  private int salary;
  private int id;
  private String department;
  private String position;
  private String email;
  private String phone;
  private String address;
  private String city;
  private String state;
  private String zip;
  private String country;


  public Employee(String firstName, String lastName, int salary, int id, String department,
                  String position, String email, String phone, String address, String city, String state,
                  String zip, String country) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.id = id;
    this.department = department;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.country = country;

  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public String toString() {
    return String.format("""
            Employee Details:
            First Name: %s
            Last Name: %s
            Salary: %d
            ID: %d
            Department: %s
            Position: %s
            Email: %s
            Phone: %s
            Address: %s
            City: %s
            State: %s
            Zip: %s
            Country: %s
            """,
        firstName,
        lastName,
        salary,
        id,
        department,
        position,
        email,
        phone,
        address,
        city,
        state,
        zip,
        country);
  }
}

