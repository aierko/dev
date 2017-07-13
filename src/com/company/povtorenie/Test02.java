package com.company.povtorenie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 19.10.2016.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int a = Integer.parseInt(reader.readLine());
         checkInterval(a);

    }
     public static void checkInterval(int a){
         if(a>50 && a<100){
             System.out.println("number in diapason");

         }else{
             System.out.println("not in diapason");
         }
     }
}
