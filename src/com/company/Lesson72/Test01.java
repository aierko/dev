package com.company.Lesson72;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 20.03.2017.
 * /* Минимальное из N чисел
 * 1. Ввести с клавиатуры число N.
 * 2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
 * 3. Найти минимальное число среди элементов списка - метод getMinimum.
 */
public class Test01 {
    public static void main(String[] args) throws IOException{

        getMinimum(getIntegerList());

    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }

    public static void getMinimum(List<Integer> list) {
        int a = list.get(0);
        for (int i = 0; i <list.size(); i++) {
            if (list.get(i) < a){
                a = list.get(i);
            }
        }
        System.out.println(a);
    }


}
