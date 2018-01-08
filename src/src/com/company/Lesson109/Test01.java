package com.company.Lesson109;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by User on 16.08.2017.
 * * /* Задача по алгоритмам
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

    public static void main(String[] args) {

    }

    public static void massiv(List<String> list) throws IOException {
        String[] array = list.toArray(new String[list.size()]);
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) {
                break;
            } else list.add(a);             // filling in
        }
    }

    public static boolean isNumber(String a) {
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;                        // is number or string?
        }
    }

    public static boolean isGreaterThan(String s, String b) {
        if (s.compareTo(b) > 0) {
            return true;
        } else return false;                        // is greater than another string or not
    }

    public static void words(List<String> list) {       // sorting words to array of elements, numbers and strings
        String[] array = list.toArray(new String[list.size()]);
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (isNumber(array[j])) {
                        String temp = array[j];
                        int a = Integer.parseInt(array[i]);
                        int b = Integer.parseInt(array[j]);
                        if (b < a) {
                            array[j] = array[i];
                            array[i] = temp;
                        }
                    }
                }
            } else {
                for (int j = 0; j < array.length; j++) {
                    if (!isNumber(array[j])) {
                        String temp = array[j];
                        if (isGreaterThan(array[i], array[j])) {
                            array[j] = array[i];
                            array[i] = temp;
                        }
                    }
                }
            }
        }
    }
}