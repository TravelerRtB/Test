package com.company;

/** class Student
 * with 4 instance variables,
 * 3 constructors, a print method,
 * and a main method to test them.
 */
public class Student
{
    // Write 4 instance variables
    private String fName;
    private String lName;
    private String eMail;
    private int grade;

    // Write 3 constructors to initialize the instance variables
    //  1. no parameters using default values
    //  2. 1 parameter and the rest default values
    //  3. 4 parameters
    public Student () {
        fName = null;
        lName = null;
        eMail = null;
        grade = 0;
    }

    public Student (int initGrade) {
        fName = "";
        lName = "";
        eMail = "";
        grade = initGrade;
    }

    public Student (String initFname, String initLname, String initEmail, int initGrade) {
        fName = initFname;
        lName = initLname;
        eMail = initEmail;
        grade = initGrade;
    }

    // Write a print method that prints all the instance variables
    public void print() {
        System.out.println("\n" + "First name is:  " + fName);
        System.out.println("Last name is:   " + lName);
        System.out.println("Email is:       " + eMail);
        System.out.println("Grade is:       " + grade);
    }
    // toString() method
    public String toString() {
        return "\n" + fName + " " + lName + " from grade " + grade + " his email is: " + eMail;
    }

    // main method
    public static void main(String[] args)
    {
        // Construct 3 Student objects using the 3 different constructors
        Student s1 = new Student();
        Student s2 = new Student(2);
        Student s3 = new Student("John", "Wick", "john.wick@gmail.com", 3);
        Student s1298 = new Student("Nejad", "Muhammad", "nejad.muhammad@gmail.com", 7);
        // call their print() methods
        s1.print();
        s2.print();
        s3.print();
        s1298.print();
        System.out.println(s3);
    }
}
