package com.company.Lesson37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.12.2016.
 *//* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {

        System.out.println(getMinimum(getIntegerList()));
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
    public static int getMinimum(List<Integer> array){
        int n = array.get(0);
        for (int i = 0; i <array.size(); i++) {
            if(n > array.get(i)){
                n = array.get(i);
            }
        }
        return n;
    }
}
