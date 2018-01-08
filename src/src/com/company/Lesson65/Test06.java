package com.company.Lesson65;


/**
 * Created by user on 01.03.2017.diapazon
 *
 */
public class Test06 {
    public static void main(String[] args) {
        System.out.println(diapazon(78));
    }

    public static int diapazon(int a){
        if (a>50 && a<100){
            System.out.println("popadaet v diapazon");
        }
        if (a<50 && a>100){
            System.out.println("ne popadaet v diapazon");
        }
        return a;
    }

}

