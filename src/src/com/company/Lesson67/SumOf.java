package com.company.Lesson67;

/**
 * Created by user on 06.03.2017.
 */
public class SumOf {
    public static void main(String[] args) {
        int [] a = {30,20,50,40,60};
        int [] b = {30,35,45,65,65};
        int v = 74;
        System.out.println(sumOfTwo(a, b, v));
    }
    public static boolean sumOfTwo (int [] a, int [] b, int v){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] + b[j] == v){
                    return true;
                }
            }
        }
        return false;
    }
}
