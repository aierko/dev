package com.company.Lesson115;

/**
 * Created by User on 09.09.2017.
 * * /* Исключение при работе со строками
 Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 String s = null;
 String m = s.toLowerCase();
 */
public class Exception {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        }catch (NullPointerException e){
            System.out.println("return ");
        }
    }
}
