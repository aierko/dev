package com.company.Lesson87;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by user on 12.05.2017.
 */
public class Setter {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        NavigableSet<Integer> set = new TreeSet<>();
        sorted(set);
        // getNextElem(set);
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }

    public static NavigableSet<Integer> sorted(NavigableSet<Integer> set) throws IOException {
        for (int i = 0; i < set.size(); i++) {
            set.add(Integer.parseInt(reader.readLine()));
        }
        return (NavigableSet<Integer>) set;
    }
}
 //   public static NavigableSet<Integer> getNextElem(NavigableSet<Integer> elem) {
   //     NavigableSet<Integer> set = new TreeSet<>();
     //
       // }
//    }
//}
