package com.company.Lesson88;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 10.05.2017.
 * Сортировка в возрастающем порядке.
 */
public class Test04 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] text = new String[10];
        massive(text);
        sort(text);
        for (String s : text) {
            System.out.println(s);
        }
    }
    public static String[] massive(String[] text) throws IOException {
        for (int i = 0; i < 10; i++) {
            text[i] = reader.readLine();
        }
        return text;
    }
    private static boolean com(String a, String b){
        return a.compareTo(b) > 0;
    }

    private static void sort(String[] array){
        for (int i = 0; i < array.length - 1; )
            if (com(array[i], array[i+1])){
                String temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                if (i >0){
                   i--;
                }
            }
            else i++;
        }
    }

