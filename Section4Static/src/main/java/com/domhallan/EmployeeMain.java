package com.domhallan;

public class EmployeeMain {

  public static void main(String[] args) {

    Employee employee1 = new Employee("John", "Doe", (byte) 30, 'M');
    Employee employee2 = new Employee("Max", "Steve", (byte) 25, 'F');
    Employee employee3 = new Employee();

    System.out.println(employee1.getAge());

    System.out.println(employee2.getAge());
    System.out.println(employee2.getGender());

    System.out.println(Employee.EMPLOYER_NAME);

    System.out.println(employee3.getAge());
  }
}
