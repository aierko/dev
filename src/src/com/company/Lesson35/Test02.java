package com.company.Lesson35;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 09.12.2016.
 *//* Минимальное из N чисел
2. Считать 10 целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        System.out.println(getMin(getIntegerList()));
    }

    public static List getIntegerList() throws IOException {
       List<Integer> array1 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            array1.add(Integer.parseInt(reader.readLine()));
        }
        return array1;
    }

    public static int getMin(List<Integer> d){
        int a = d.get(0);
        for (int i = 1; i < d.size(); i++) {
              if (a > d.get(i)){
                  a = d.get(i);
              }
        }
        return a;
    }
}
