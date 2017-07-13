package com.company.Shpargalka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 04.11.2016.
 */
public class Shpargalko {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // String[] array = new String[-];

        list.add("text"); // array[0] = "text"; // DOBAVLENIE
        list.add("text1"); // array[1] = "text1";
        list.add(0, "text2"); // array[2] = "text2"; // VSTAVKA

        list.set(1, "retre"); // PEREZAPIS'

        int n = list.size(); // array.length;
        System.out.println(n);
        list.remove(2);       // DELETE
        System.out.println(list.size());

        System.out.println(list.get(1)); // sout(array[1]);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
