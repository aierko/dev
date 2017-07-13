package com.company.Lesson27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 18.11.2016.
 *///Вводить числа и добавлять их в список. Удалить из списка все значения больше 10.
public class Test01 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String a = reader.readLine();
            if (a.isEmpty()) break;

            int s = Integer.parseInt(a);
            list.add(s);
        }
        for (int i = 0; i <list.size(); ) {
            if(list.get(i)>10 ){
                list.remove(i);
            } else {
                i++;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
