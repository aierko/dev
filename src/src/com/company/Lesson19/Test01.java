package com.company.Lesson19;

/**
 * Created by user on 28.10.2016.
 */
public class Test01 {
    public static void main(String[] args) {
        int[] array ={12,53,45,76,-34,54};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}
