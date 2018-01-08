package com.company.Lesson22;

/**
 * Created by user on 08.11.2016.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Test04 {
    public static void main(String[] args) throws IOException {
        List<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            array.add(reader.readLine());
        }
        int minLenth = array.get(0).length();
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).length() < minLenth){
                minLenth = array.get(i).length();
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i).length() == minLenth){
                System.out.println(array.get(i));
            }
        }
    }
}
