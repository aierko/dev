package com.company.Lesson90;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15.05.2017.
 * /* Исключение при работе с коллекциями List
 Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 List<String> list = new ArrayList<String>();
 String s = list.get(18);
 */
public class Test06 {
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<String>();
            String s = list.get(5);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(" off ");
        }
    }
}
