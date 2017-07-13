package com.company.Lesson36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.12.2016.
 *//* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/
public class MinN {
    public static void main(String[] args) throws IOException {
        List<Integer> array = getIntegerList();
        System.out.println(getMin(array));
    }
    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n  ; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
    public static int getMin(List<Integer> arrr){
        int a = arrr.get(0);
        for (int i = 0; i < arrr.size(); i++) {
            if(a> arrr.get(i)){
                a = arrr.get(i);
            }
        }
        return a;
    }
}
