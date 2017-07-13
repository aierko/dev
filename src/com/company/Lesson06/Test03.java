package com.company.Lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 14.09.2016.
 *//* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a<b) && (a>c)){
            System.out.println(a);
        }
        else if ((a<c) && (a>b)) {
            System.out.println(a);
        }


         if ((b<c) && (b>a)){
             System.out.println(b);
         }else if (( b>c) && ( b<a) ){
             System.out.println(b);
         }


         if ((c<b) && (c>a)){
            System.out.println(c);
        } else if ((c>b) && (c<a)){
            System.out.println(c);
        }


    }

}
