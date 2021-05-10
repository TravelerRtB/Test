package com.company;

/**
 * Pet class is designed to keep track of the name, age, weight, type of animal,
 * and breed for records at an animal clinic.
 *
 * @author Nejad Muhammad
 * @since 10 May, 2021
 */
class Pet {
    // keep track of the name, age, weight, type of animal, and breed of the pet.
    private String name;
    private double age;
    private double weight;
    private String type;
    private int breed;

    // Write 2 constructors. Use good commenting!
    public Pet(String initName, double initAge, double initWeight, String initType, int initBreed) {
        name = initName;
        age = initAge;
        weight = initWeight;
        type = initType;
        breed = initBreed;
    }

    // Write accessor (get) methods. Use good commenting!
    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public int getBreed() {
        return breed;
    }

    // Write a toString method. Use good commenting!

    @Override
    public String toString() {
        return "Pet's name is '" + name + '\'' +
                ", it's " + age + " years old" +
                " and has a weight of " + weight + "kg" +
                ", and it's a '" + type + '\'' +
                ", usually, it's a breed of " + breed;
    }

    // Don't forget to complete the main method in the TesterClass below!
}

public class TesterClass {
    // main method for testing
    public static void main(String[] args) {
        // Create 3 Pet objects and test all your methods
        Pet p1 = new Pet("Petty", 2.5, 7, "Dog", 4);
        System.out.println(p1);
        System.out.println("\nIts name is " + p1.getName());
        System.out.println(p1);
    }
}

