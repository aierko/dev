package com.company.Lesson44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 03.01.2017.
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
public class Lesson01 {
    public static void main(String[] args) throws IOException {
       List<String> list = getList();
        System.out.println(fix(list));
    }
    public static List getList() throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String a = reader.readLine();
            if (a.isEmpty()) break;
            else list.add(a);
        }

        return list;
    }
    public static List fix(List<String> arr10){
        List<String> arr1 = new ArrayList<>();
        for (int i = 0; i < arr10.size(); i++) {
            if(arr10.get(i).contains("р") && arr10.get(i).contains("л")){
                arr1.add(arr10.get(i));
            }
            else if(arr10.get(i).contains("р")){
            }
            else if(arr10.get(i).contains("л")){
                arr1.add(arr10.get(i));
                arr1.add(arr10.get(i));
            }
            else arr1.add(arr10.get(i));
        }
        return arr1;
    }

}
