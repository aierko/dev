package com.company.Lesson26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 16.11.2016.
 *///чётные числа добавлять в конец списка, нечётные – в начало
public class Test02 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty())
                break;
            else{
                int d = Integer.parseInt(s);
                if(d % 2 == 0){
                    list.add(d);
                }else{
                    list.add(0, d);
                }

            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
