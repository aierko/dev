package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by user on 06.09.2016.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your choise: 1 - lol(kvadrat), 2 - convert1, 3 - precent, other number - to exit");
        int number = Integer.parseInt(reader.readLine());

        switch(number){

            case 1:
                System.out.println("Enter your number: ");
                lol(Double.parseDouble(reader.readLine()));
                break;

            case 2:
                System.out.println("Enter USD: ");
                convert1(Double.parseDouble(reader.readLine()));
                break;

            case 3:
                System.out.println("Enter your number and procent (0<1): ");
                precent(Double.parseDouble(reader.readLine()), Double.parseDouble(reader.readLine()));
                break;

            default:
                System.out.println("Programm is over!");
                break;
        }


    }
    public static void lol(double a){
        System.out.println("Kvadrat = " + a*a);

    }

    public static void convert1(double a){
        System.out.println("USD = " + a);
        System.out.println("UAH = " + a*26.2);
    }

    public static void precent(double a, double b){
        System.out.println("Procent = " + a*b);
    }
}
