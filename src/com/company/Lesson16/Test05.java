package com.company.Lesson16;

/**
 * Created by user on 21.10.2016.
 */
public class Test05 {
    public static void main(String[] args) {
        int[] a ={12,54,65,4,78};

        int min = a[0];
        for (int i = 0; i <a.length; i++) {
            if (a[i] < min){
                min = a[i];
            }
            }
        System.out.println(min);

        }
    }

