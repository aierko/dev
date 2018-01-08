package com.company.Lesson60;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 13.02.2017.
 * создать список чисел, заполнить пока не введена пустая строка, удалить все числа больше 5.
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = trueFulse();

        for (int i = 0; i < list.size(); ) {
            if (list.get(i) >= 6) {
                list.remove(i);
            }
            else i++;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static List trueFulse() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr1 = new ArrayList<>();
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) break;
            arr1.add(Integer.parseInt(a));
        }
        return arr1;
    }
}
