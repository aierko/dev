package com.company.Lesson25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15.11.2016.
 *///чётные числа добавляются в конец списка, нечётные – в начало
public class Test04 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String a = reader.readLine();
            if(a.isEmpty()){
                break;
            }
            else {
                int s = Integer.parseInt(a);
                if(s % 2 == 0){
                    list.add(s);
                } else {
                    list.add(0, s);
                }

            }
        }
    }
}
