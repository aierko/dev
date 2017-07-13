package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 27.01.2017.
 * Реализовать метод compare(int a).
 Метод должен выводить строку на экран "Число меньше 5", если параметр метода меньше 5 - и,
 выводить строку "Число больше 5", если параметр метода больше 5 - и, и выводить строку "Число равно 5",
 если параметр метода равен 5 - и.
 */
public class Work07 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        compare(a);
    }

    public static void compare(int a) {
        if (a < 5 ) {
            System.out.println("Число меньше 5 ");
        }
        if (a > 5 ) {
            System.out.println("Число больше 5 ");
        }
        if(a == 5){
            System.out.println("Число равно 5 ");
        }


    }
}