package com.company.HomeWork2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 16.07.2017./* Метод в try..catch
 * Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
 * Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
 * этого метода в try..catch.
 * Если пользователь ввёл какой-то текст, вместо ввода числа,
 * то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
 * Числа выводить с новой строки сохраняя порядок ввода.
 */
public class Repit03 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        readData();

    }

    public static void readData() throws IOException {
        List<Integer> list = new ArrayList<>();
        try {
            while (true) {
                String a = reader.readLine();
                if (a.isEmpty()){
                    break;
                }
                list.add(Integer.parseInt(a));

            }
        }catch (NumberFormatException e){
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }

}
