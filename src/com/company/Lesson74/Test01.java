package com.company.Lesson74;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 24.03.2017.
 * /* Минимальное из N чисел
 1. Ввести с клавиатуры число N.
 2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
 3. Найти минимальное число среди элементов списка - метод getMinimum.
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        getIntegerList(list);
        System.out.println(getMinimum(list));
    }
    public static void getIntegerList(List<Integer> list) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
    }
    public static int getMinimum(List<Integer> list){
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)){
                min = list.get(i);
            }

        }
        return min;

    }
}
