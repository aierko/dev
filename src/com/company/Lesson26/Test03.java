package com.company.Lesson26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 16.11.2016.
 *///Вводить числа и добавлять в список. Удалить со списка все значение больше 5.
public class Test03 {
    public static void main(String[] args) throws IOException {
        List<Integer> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()){
                break;
            }
            else {int a = Integer.parseInt(s);
                array.add(a);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)>5){
                array.remove(i);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
