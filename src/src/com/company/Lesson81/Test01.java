package com.company.Lesson81;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.04.2017.
 *
 */
public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        String [] mas = list.toArray(new String[list.size()]);
        for (String ma : mas) {
            System.out.println(ma);
        }
    }
}
