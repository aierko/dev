package com.company.AlexPackage;

/**
 * Created by Artyom on 10.08.2016.
 */
public class Cycle
{
    public static void main(String[] args)
    {

        for(int i = 1; i < 11; i++){
            System.out.println(i);
        }


        for (int i = 0; i < 7; i++){
            System.out.println("50");
        }


        System.out.println("----------------------------------------------");


        int i = 12;
        while(i < 11){
            System.out.println(i);
            i++;
        }


        System.out.println("----------------------------------------------");



        do{
            System.out.println(i);
        }while(i < 11);

    }
}
