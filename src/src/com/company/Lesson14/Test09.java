package com.company.Lesson14;

/**
 * Created by user on 18.10.2016.
 */
public class Test09 {
    public static void main(String[] args) {
        int[] a = {12,-78,93,-10,45,7};
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);

    }

}
