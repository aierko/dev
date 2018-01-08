package com.company.HomeWork;

import java.util.Scanner;

/**
 * Created by user on 24.02.2017./* Удвой слова
 1. Введи с клавиатуры 10 слов в список строк.
 2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
 3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
 */
/* Буква «р» и буква «л»
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
public class Work17 {
    public static void main(String[] args) {
        System.out.println("Enter your username?: ");
        Scanner scanner = new Scanner(System.in);
        int username = scanner.nextInt();
        System.out.println("Your username is " + username);
    }
}
