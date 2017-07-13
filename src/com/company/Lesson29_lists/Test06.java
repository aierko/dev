package com.company.Lesson29_lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 25.11.2016.
 *//* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/
public class Test06 {
    public static void main(String[] args) throws IOException {
        List<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String a = reader.readLine();
            if (a.equals("end")){
                break;
            }
            else array.add(a);
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        }
    }

