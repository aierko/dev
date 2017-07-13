package com.company.Lesson91;

/**
 * Created by user on 17.05.2017.
 * /* Исключение при работе со строками
 Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 String s = null;
 String m = s.toLowerCase();
 */
public class Test02 {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e){
            System.out.println("previryay");
        }

    }
}
