package com.company.Lesson51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 20.01.2017.
 *//* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:

лира
лоза
Выходные данные:
лира
лоза
лоза
*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        List<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) break;
            else array.add(a);
        }
        List<String> list = fix(array);
        System.out.println(list);
    }

    public static List<String> fix(List<String> arr) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("р") && arr.get(i).contains("л")) {
                list.add(arr.get(i));
            }
            if (arr.get(i).contains("р")) {

            }
            if (arr.get(i).contains("л")) {
                list.add(arr.get(i));
                list.add(arr.get(i));
            }
            else list.add(arr.get(i));
        }
        return list;
    }
}

