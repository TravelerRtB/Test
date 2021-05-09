package com.company;

public class Employee {
    // instance variables for Employee attributes (Employee Instance Variables)
    private final String name;
    private final String email;
    private final String phoneNumber;


    // A constructor to construct an Employee by copying in the data into the instance variables
    // which is used later to initialize the attributes for an Employee object with the given
    // parameters (String initName, String initEmail, String initPhone

    public Employee (String initName, String initEmail, String initPhone) {
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
    }

    // A method to print all the data (the attributes) for an employee:

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    // main method for executing the program:

    public static void main(String[] args) {	// call the constructor to create a new employee

        Employee emp1 = new Employee ("John", "john@office.com", "111-111-1111");

        emp1.print();	// call emp1's print method

        Employee emp2 = new Employee ("Mark", "mark@office.com", "222-222-2222");
        emp2.print();
    }
}
