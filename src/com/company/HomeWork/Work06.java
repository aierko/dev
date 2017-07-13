package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 27.01.2017.
 * Реализовать метод checkInterval.
 Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
 "Число а не содержится в интервале." или "Число а содержится в интервале.", где а - аргумент метода.
 */
public class Work06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        checkInterval(a);
    }

    public static void checkInterval(int a){
        if (a>50 && a<100){
            System.out.println("Число " + a + " содержится в интервале");
        }
        else{
            System.out.println("Число " + a + " не содержится в интервале");
        }

    }

}
