package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.12.2016.
 */
public class Home4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(i, reader.readLine());
        }
        List<String> result = doubleValues(list);
        for (int i = 0; i < list.size(); i++)
            System.out.println(result.get(i));
    }

    public static List<String> doubleValues(List<String> list) {
        for (int i = 0; i < list.size(); ) {
            list.add(i + 1, list.get(i));
            i += 2;
        }
        return list;
    }

}
