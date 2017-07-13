package com.company.Lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 02.11.2016.
 */ // водить числа, пока не ввели -1, потом считаем сумму чисел
public class Test05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int sum = 0;
        do {
            a = Integer.parseInt(reader.readLine());
            sum = sum + a;
        } while (a != -1);
        System.out.println(sum);
    }
}
