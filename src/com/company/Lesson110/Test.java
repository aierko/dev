package com.company.Lesson110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 20.08.2017.
 * * * /* Задача по алгоритмам
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
public class Test {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
     String [] array = fillList(new ArrayList<>());
     arraySortWordsandNumbers(array);
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static String[] fillList(List<String> list) throws IOException {
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) {
                break;
            } else list.add(a);
        }
        String[] array = list.toArray(new String[list.size()]);
        return array;
    }

    public static boolean isNumber(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isGreatherThen(String s, String d) {
        if (s.compareTo(d) > 0) {
            return true;
        } else return false;
    }

    public static void arraySortWordsandNumbers(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (isNumber(array[j])) {
                        String temp = array[j];
                        int a = Integer.parseInt(array[i]);
                        int b = Integer.parseInt(array[j]);
                        if (a > b) {
                            array[j] = array[i];
                            array[i] = temp;
                        }
                    }

                }
            } else
                for (int j = 0; j < array.length; j++) {
                    if (!isNumber(array[j])) {
                        if (isGreatherThen(array[j], array[i])) {
                            String temp = array[j];
                            array[j] = array[i];
                            array[i] = temp;
                        }
                    }
                }
        }
    }
}
