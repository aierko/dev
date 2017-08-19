package com.company.Lesson108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 11.08.2017.
 *  Гласные и согласные буквы
 Написать программу, которая вводит с клавиатуры строку текста.
 Программа должна вывести на экран две строки:
 1. первая строка содержит только гласные буквы
 2. вторая - только согласные буквы и знаки препинания из введённой строки.
 Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
 public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
 Пример ввода:
 Мама мыла раму.
 Пример вывода:
 а а ы а а у
 М м м л р м .
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        enterString();
    }

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static void enterString() throws IOException {
        String text = reader.readLine();
        String vowels = " ";
        String consenents = " ";
        char[] chars = text.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if (isVowels(chars[i])){
                vowels += chars[i] + " ";
            }
            else if (chars[i] == ' '){
                continue;
            }
            else consenents += chars[i] + " ";
        }
        System.out.println(vowels);
        System.out.println(consenents);
    }
    public static boolean isVowels(char d) throws IOException {
        d = Character.toLowerCase(d);
        for (int i = 0; i <vowels.length; i++) {
            if (vowels[i] == d){
                return true;
            }
        }
        return false;
    }
}
