package com.company.Lesson132;

/**
 * Created by User on 10.11.2017.
 * *****
 * *****
 * *****
 * *****
 * *****
 *
 */
public class Test02 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= i)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
