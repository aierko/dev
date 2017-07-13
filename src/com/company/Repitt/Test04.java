package com.company.Repitt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 20.02.2017.
 * /* Буква «р» и буква «л»
 * 1. Создай список слов, заполни его самостоятельно.
 * 2. Метод fix должен:
 * 2.1. удалять из списка строк все слова, содержащие букву «р»
 * 2.2. удваивать все слова содержащие букву «л».
 * 2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
 * 2.4. с другими словами ничего не делать.
 * Пример:
 * <p>
 * лира
 * лоза
 * Выходные данные:
 * лира
 * лоза
 * лоза
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            String a = (reader.readLine());
            if (a.isEmpty()) break;
            list.add(a);
        }
        List<String> arr = fix(list);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }


    }

    public static List fix(List<String> array) {
        List<String> arr2 = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).contains("р") && array.get(i).contains("л"))  {
                arr2.add(array.get(i));
            } else if (array.get(i).contains("л")){
                arr2.add(array.get(i));
                arr2.add(array.get(i));
            } else if(array.get(i).contains("р")){
            } else {
                arr2.add(array.get(i));
            }
        }
        return arr2;
    }
}
