package com.company.Lesson31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза.
 * Если число отрицательное, то прибавить единицу. Вывести результат на экран.
 */
public class Vvodchisla {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        enter(a);
    }
    public static void enter (int a){
        if(a>0){
            System.out.println(a * 2);
        }
        else if(a<0){
            System.out.println(a + 1);
        }
    }
}
