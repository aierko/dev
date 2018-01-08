package com.company.Lesson31;

/**
 * Created by user on 30.11.2016.
 *///Реализовать метод closeToTen.
        //Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
        //Например, среди чисел 8 и 11 ближайшее к десяти 11.
       // Если оба числа на равной длине к 10, то вывести на экран любое из них.*//
public class Closetoten {
    public static void main(String[] args) {
        closeToTen(9, 11);
    }
    public static void closeToTen (int a, int b){ // 7 8
        int closeA = 10 - a; // 2
        int closeB = 10 - b; // 3
        if( closeA<closeB ){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
