package com.company.Lesson115;

/**
 * Created by User on 09.09.2017.
 */
public class Exception42 {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e){
            System.out.println("never the less");
        }
    }
}
