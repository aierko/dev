package com.company.Lesson65;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 27.02.2017./* Удалить все числа больше 10
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

    public static Set removeAllNumbersMoreThan10(Set<Integer> set) {
        Iterator<Integer> set1 = set.iterator();
        while(set1.hasNext()) {
            Integer a = set1.next();
            if (a > 10) {
                set1.remove();
            }
        }
        return set;
    }


}
