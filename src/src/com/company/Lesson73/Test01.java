package com.company.Lesson73;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 22.03.2017.
 * /* Минимальное из N чисел
 * 1. Ввести с клавиатуры число N.
 * 2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
 * 3. Найти минимальное число среди элементов списка - метод getMinimum.
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Integer> list = getIntegerList();
        System.out.println(getMinimum(list));

//       System.out.println(getMinimum(getIntegerList()));

    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }

    public static int getMinimum(List<Integer> list) throws IOException {
         int a = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < a) {
                a = list.get(i);
            }
        }
        return a;
    }
}
