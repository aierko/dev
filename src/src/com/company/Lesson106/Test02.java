package com.company.Lesson106;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 30.07.2017.
 * Гласные и согласные буквы
 * Написать программу, которая вводит с клавиатуры строку текста.
 * Программа должна вывести на экран две строки:
 * 1. первая строка содержит только гласные буквы
 * 2. вторая - только согласные буквы и знаки препинания из введённой строки.
 * Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
 * public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
 * Пример ввода:
 * Мама мыла раму.
 * Пример вывода:
 * а а ы а а у
 */
public class Test02 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        vvodDannikh();
    }

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё', 'і'};

    public static void vvodDannikh() throws IOException {
        String text = reader.readLine();
        String vowel = "";
        String consonets = "";
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                vowel += chars[i] + " ";
            }
            else if (chars[i] == ' ' ){
                continue;
            }
            else consonets += chars[i] + " ";
        }
        System.out.println(vowel);
        System.out.println(consonets);
    }

    public static boolean isVowel(char a) { // у
        a = Character.toLowerCase(a); // понижение регистра.
        for (int i = 0; i < vowels.length; i++) {
            if (a == vowels[i]) {
                return true;
            }
        }
        return false;
    }
}


