package com.company.Lesson38;

/**
 * Created by user on 16.12.2016.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/** Буква «р» и буква «л»
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
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        List<String> list = getList();
        System.out.println(fix(list));
    }
    public static List<String> getList() throws IOException {
        List<String> arr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arr.add(reader.readLine());
        }
        return arr;
    }

    public static List<String> fix(List<String> list){
        List<String> array16 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains("р") && list.get(i).contains("л")){
                array16.add(list.get(i));
            }
            else if (list.get(i).contains("SWAT")){
            }
            else if(list.get(i).contains("л")){
                array16.add(list.get(i));
                array16.add(list.get(i));
            }
            else array16.add(list.get(i));

        }
        return array16;
    }
}
