package com.company.Lesson133;

/**
 * Created by User on 14.11.2017.
 */
public class Test02 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Pet pet = new Pet();
        printResults(cat instanceof Pet,  tiger instanceof Pet, pet instanceof Pet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet) {
        if (cat && tiger && pet) {
            System.out.println("Bingo!");
        }
    }


}
