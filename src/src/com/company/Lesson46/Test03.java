package com.company.Lesson46;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 09.01.2017.
 */
/*ввесте три числа и найти минимальное*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
            if (a<b && a<c){
                System.out.println(a);
            }
            if (b<a && b<c){
                System.out.println(b);
            }
            if (c<a && c<b){
                System.out.println(c);
            }
        }
    }
