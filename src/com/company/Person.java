package com.company;

public class Person
{
    // instance variables
    private final String name;
    private final String email;
    private final String phoneNumber;

    // constructor: construct a Person copying in the data into the instance variables
    public Person(String initName, String initEmail, String initPhone)
    {
        name = initName;
        email = initEmail;
        phoneNumber = initPhone;
    }

    // Print all the data for a person
    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }

    // main method for testing
    public static void main(String[] args)
    {
        // call the constructor to create a new person
        Person p1 = new Person("Sana", "sana@gmail.com", "123-456-7890");
        // call p1's print method
        p1.print();
        Person p2 = new Person("Jean", "jean@gmail.com", "404 899-9955");
        p2.print();
        System.out.println("p1 phone number is: " + p1.phoneNumber);
        System.out.println("p2 phone number is: " + p2.phoneNumber);
    }
}
