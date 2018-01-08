package com.company.Lesson42;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 26.12.2016.
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
public class Test02 {
    public static void main(String[] args) throws IOException {
         List<String> list = spisok();
        System.out.println(fix(list));
    }

    public static List spisok() throws IOException {
        List<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            array.add(s);
        }
        return array;
    }

    public static List fix(List<String> arr1) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i).contains("р") && arr1.get(i).contains("л")) {
                list.add(arr1.get(i));
            } else if (arr1.get(i).contains("р")) {
            } else if (arr1.get(i).contains("л")) {
                list.add(arr1.get(i));
                list.add(arr1.get(i));
            } else list.add(arr1.get(i));
        }
        return list;


    }

}
