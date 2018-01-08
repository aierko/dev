package com.company.Lesson108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11.08.2017.
 * /* Задача по алгоритмам
 * Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
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
 */
public class Test04 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        mass(list);
        String[] array = list.toArray(new String[list.size()]);
        slova(array);
        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void mass(List<String> array) throws IOException {
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) {                  //заполнение массива
                break;
            } else array.add(a);
        }
    }

    public static void slova(String[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (isNumber(array[j])) {
                        int a = Integer.parseInt(array[i]); //?
                        int b = Integer.parseInt(array[j]); //?
                        String temp = "";
                        if (a > b) {
                            temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            } else {
                for (int j = 0; j < array.length; j++) {
                    if (!isNumber(array[j])) {
                        if (isGreaterThan(array[i], array[j])) {
                            String temp = array[j];
                            array[j] = array[i];
                            array[i] = temp;
                        }
                    }
                }
            }
        }
    }

    public static boolean isGreaterThan(String a, String b) { // sorting Strings
        if (a.compareTo(b) < 0) {
            return true;
        } else return false;
    }

    public static boolean isNumber(String a) {     // проверка на число
        try {
            Integer.parseInt(a);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
