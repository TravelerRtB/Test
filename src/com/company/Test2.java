package com.company;

public class Test2 {
    public static void main(String[] args) {
        String message = greetUser ("Nejad", "Muhammad");
        System.out.println(message);
    }
    public static String greetUser(String firstName, String lastName){
        return "Hello " + firstName + " " + lastName;
    }
}
