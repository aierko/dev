package com.company.Lesson70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 15.03.2017.
 * /* Удалить все числа больше 10
 Создать множество чисел(Set<Integer>), занести туда 10 различных чисел.
 При помощи метода  removeAllNumbersMoreThan10 удалить из множества все числа больше 10.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        removeAllNumbersMoreThan10(numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
    public static void removeAllNumbersMoreThan10(Set<Integer> set){
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()){
            if (iter.next() >= 10 ) iter.remove();
        }
    }
}
