package com.company.Lesson25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15.11.2016.
 */ // Вводить числа и записывать их в список, пока не ввели пустую строку
public class Test06 {
    public static void main(String[] args) throws IOException {
        List<Integer> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String g = reader.readLine();
            if(g.isEmpty()){
                break;
            }
            else {
                int a = Integer.parseInt(g);
                array.add(a);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i)>5){
                array.remove(i);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
