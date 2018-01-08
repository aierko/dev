package com.company.Lesson43;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 28.12.2016.
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
         List<String> pusok = pisok();
        System.out.println(fix(pusok));
    }
    public static List pisok() throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = reader.readLine();
            if(s.isEmpty()) break;
            else list.add(s);
        }
        return list;
    }
    public static List fix(List<String> array1){
        List<String> arr2 = new ArrayList<>();
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i).contains("р") && array1.get(i).contains("л")){
                arr2.add(array1.get(i));
            }
            else if (array1.get(i).contains("р")){
            }
            else if (array1.get(i).contains("л")){
                arr2.add(array1.get(i));
                arr2.add(array1.get(i));
            }
            else arr2.add(array1.get(i));
        }
        return arr2;
    }
}
