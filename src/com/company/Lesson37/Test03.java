package com.company.Lesson37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.12.2016.
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
         List<String> arr = write();
         arr = fix(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static List<String> write() throws IOException {
        List<String> array = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) {
                break;
            } else array.add(a);
        }
        return array;
    }

    public static List<String> fix(List<String> arr) {
        List<String> array5 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("р") && (arr.get(i).contains("л"))) {
                array5.add(arr.get(i));
            } else if (arr.get(i).contains("л")) {
                array5.add(arr.get(i));
                array5.add(arr.get(i));
            } else if (arr.get(i).contains("р")) {}
            else {
                array5.add(arr.get(i));
            }
        }
        return array5;
    }
}
