package com.company.AlexPackage;

/**
 * Created by Artyom on 30.08.2016.
 */
public class Test01 {
    public static void main(String[] args)
    {
        String str = "One 1, Two1, Three, 1 Four 1";
        String new_str = str.replace ('1', '2');
        System.out.println(new_str);

        // Добавим цифр, чтобы было что заменять.
        String s = "abc123abc+0abc123+123";

        //Находим индекс первого фхождения символа "+".
        int p = s.indexOf("+");

        String result;
        if (p == -1) {
            //Если симвоол "+" не найден в строке, то результатом будет исходная
            //строка
            result = s;
        } else {
            //Если символ "+" найден,
            //результат склеиваем из двух частей.
            //Первая - до первого вхождения символа с заменёнными на "-" цифрами.
            //Вторая часть - после плюса и без изменений.
            result = s.substring(0, p).replaceAll("[0-9]", "-")
                    + s.substring(p);
        }
        System.out.println(result);
    }
}
