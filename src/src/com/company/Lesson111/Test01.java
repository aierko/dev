package com.company.Lesson111;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 21.08.2017.
 * * * * /* Задача по алгоритмам
 * Пример ввода:
 * Вишня
 * 1
 * Боб
 * 3
 * Яблоко
 * 2
 * 0
 * Арбуз
 * Пример вывода:
 * Арбуз
 * 3
 * Боб
 * 2
 * Вишня
 * 1
 * 0
 * Яблоко
 * <p>
 * Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        String[] array = fillInArray(list);
        sortStrings(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
    public static String[] fillInArray(List<String> list) throws IOException {
        while (true){
            String d = reader.readLine();
            if (d.isEmpty()){
                break;
            }
            else list.add(d);
        }
        String[] array = list.toArray(new String[list.size()]);
        return array;
    }
    public static boolean checkTheNumber(String a){
        try{
            Integer.parseInt(a);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static boolean checkTheString(String x, String y){
        if (x.compareTo(y) > 0){
            return true;
        }
        else return false;
    }
    public static void sortStrings(String[] array){
        for (int i = 0; i < array.length; i++) {
            if (checkTheNumber(array[i])){
                for (int j = 0; j <array.length; j++) {
                    if (checkTheNumber(array[j])){
                        String temp = array[j];
                        int a = Integer.parseInt(array[i]);
                        int b = Integer.parseInt(array[j]);
                        if (a > b){
                            array[j] = array[i];
                            array[i] = temp;
                        }
                    }
                }
            }else for (int j = 0; j < array.length; j++) {
                if (!checkTheNumber(array[j])){
                    if (checkTheString(array[j],array[i])){
                        String temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }


}
