package com.company.Lesson18;

/**
 * Created by user on 26.10.2016.
 */
public class Test01 {
    public static void main(String[] args) {
        int[] array ={665, 782, 64, 983, -6};
        int min = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]<min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
