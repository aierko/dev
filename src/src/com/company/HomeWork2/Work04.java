package com.company.HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 16.07.2017.Гласные и согласные буквы
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
 * М м м л р м .
 */
public class Work04 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        vvodstroki();
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static void vvodstroki() throws IOException {
        String a = reader.readLine(); // vvod teksta "Text"
        String vowel = "";             // peremennaya glasnaya
        String consonants = "";        // peremennaya soglasnaya
        char[] chars = a.toCharArray(); // [0]T [1]e [2]x [3]t ????
        //List<Character> list = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                vowel += chars[i] + " ";   //
            } else if (chars[i] == ' ') {  // ??
                continue;
            } else {
                consonants += chars[i] + " ";
            }
        }

        System.out.println(vowel);
        System.out.println(consonants);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // checking to register ??
        for (int i = 0; i < vowels.length; i++) {     // vowels.length
            if (vowels[i] == c) {           //  checking if vowels[i] == c,  return true ->
                                            // else return false;
                return true;
            }
        }
        return false;
    }


}
