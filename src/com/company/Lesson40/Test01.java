package com.company.Lesson40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21.12.2016.
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
public class Test01 {
    public static void main(String[] args) throws IOException {
      List<String> list = spisok();
        System.out.println(fix(list));
    }

    public static List<String> spisok() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> array = new ArrayList<>();
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) {
                break;
            } else array.add(a);
        }
        return array;

    }

    public static List<String> fix(List<String> list){
        List<String> array2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("р")&& list.get(i).contains("л")){
                array2.add(list.get(i));
            }
            else if (list.get(i).contains("р")){
            }
            else if (list.get(i).contains("л")){
                array2.add(list.get(i));
                array2.add(list.get(i));
            }
            else array2.add(list.get(i));
        }
        return array2;
    }
}
