package com.company.Lesson06;

/**
 * Created by user on 14.09.2016.
 */
public class Test04 {
    public static void main(String[] args) {
        String[] array = new String[10];
        array[2] = "test";
        array[3] = "cho";
        array[0] = "money";

        for  ( int i = 0; i < array.length; i++  ){
            System.out.println(array [i]);
        }

    }


}
