package com.company.Lesson104;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 17.07.2017.
 Гласные и согласные буквы
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
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        enterString();
    }
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static void enterString() throws IOException {
        String s = reader.readLine();
        char[] chars = s.toCharArray();
        String vowel = " ";
        String consonats = " ";
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])){
               vowel += chars[i] + " ";
            }else if (chars[i] == ' '){
                continue;
            }else consonats += chars[i] + " ";
        }
        System.out.println(vowel);
        System.out.println(consonats);
    }
    public static boolean isVowel(char a){
        a = Character.toLowerCase(a);
        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == a){
                return true;
            }
        }
        return false;
    }
}
