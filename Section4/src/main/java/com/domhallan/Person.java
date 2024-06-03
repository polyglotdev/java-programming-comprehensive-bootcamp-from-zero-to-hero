package com.domhallan;

public class Person {
  private String name;
  private int age;
  private String gender;
  private String nationality;
  private String career;

  public Person(String name, int age, String gender, String nationality, String career) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.nationality = nationality;
    this.career = career;
  }

  public Person() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public String getCareer() {
    return career;
  }

  public void setCareer(String career) {
    this.career = career;
  }
}
