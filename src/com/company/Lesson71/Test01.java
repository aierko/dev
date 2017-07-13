package com.company.Lesson71;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 17.03.2017./* Удалить все числа больше 10
 * Создать множество чисел(Set<Integer>), занести туда 10 различных чисел.
 * При помощи метода  removeAllNumbersMoreThan10 удалить из множества все числа больше 10.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(reader.readLine()));
        }
        removeAllNumbersMoreThan10(set);
        for (Integer integer : set) {
            System.out.println(integer);
        }

    }


    public static void removeAllNumbersMoreThan10(Set<Integer> chisla) {
        Iterator<Integer> chisla1 = chisla.iterator();
        while (chisla1.hasNext()) {
            if (chisla1.next() >= 10) chisla1.remove();
        }
    }
}
