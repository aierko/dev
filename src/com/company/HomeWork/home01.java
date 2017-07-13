package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 07.09.2016.
 */
public class home01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1 - ddd, 2 - glass, 3 - (5*10)");
        int a = Integer.parseInt(reader.readLine());

        switch (a){
            case 1:
                System.out.println(ddd(Integer.parseInt(reader.readLine())));
                break;
            case 2:
                glass();
                break;
            case 3:
                System.out.println(5*10);
                break;
            default:
                System.out.println("Prog is over!");
        }
    }
    public static int ddd (int f){
        return  (f*f);
    }

    public static void glass (){
        String a = ("хочешь решай задачи, не хочешь-решай нехотя");
        System.out.println(a);
    }


}
