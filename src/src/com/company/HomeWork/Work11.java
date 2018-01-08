package com.company.HomeWork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 02.02.2017.
 * /* Удалить все числа больше 10
 Создать список чисел, занести туда 20 различных чисел.
 Создать метод  removeAllNumbersMoreThan10, в котором удалить из списка все числа больше 10.
 */

public class Work11 {
    public static void main(String[] args) throws IOException {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            array.add(i);
        }
        System.out.println(removeAllNumbersMoreThan10(array));
    }

    public static List removeAllNumbersMoreThan10(List<Integer> array) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
             int a = 10;
            if (array.get(i) > a){
                array.remove(i);
            }
            else arr.add(i);
        }
        return arr;
    }

}


