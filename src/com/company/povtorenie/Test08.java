package com.company.povtorenie;

/**
 * Created by user on 19.10.2016.
 * Найти минимальное число.
 */
public class Test08 {
    public static void main(String[] args) {
        int[] a ={65,98,78,-1,10};
        int min = a[0] ; // 65

        for (int i = 1; i < a.length; i++) {
            if(a[i]<min) { // 12 < 65 ; -6 < 12
                min = a[i]; // min = 12 ; min = -6
            }
        }
        System.out.println(min);
    }
}
