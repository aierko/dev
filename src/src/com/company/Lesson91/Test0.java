package com.company.Lesson91;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 17.05.2017.
 * /* Исключение при работе с коллекциями List
 Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
 List<String> list = new ArrayList<String>();
 String s = list.get(18);
 */
public class Test0 {
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<String>();
            String s = list.get(Integer.parseInt("34"));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("вводи правильно");
        }
    }
}
