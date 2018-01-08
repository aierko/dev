package com.company.Shpargalka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 04.11.2016.
 */
public class Test02 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(4);
        array.add(5);
        array.add(0, 6);
        array.set(3, 7);
        array.remove(2);
        for (int i = 0; i <array.size(); i++) {
            System.out.println(array.get(i));
        }

    }
}
