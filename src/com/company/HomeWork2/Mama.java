package com.company.HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 02.08.2017.
 * /**
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
public class Mama {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
      enterText();
    }
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static void enterText() throws IOException {
        String гласные = reader.readLine();
        String согласные = reader.readLine();
        char [] chars = гласные.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (isVowels(chars[i])){
                гласные += chars[i] + " ";
            }
            else if (chars[i]==  ' '){
                continue;
            }
            else согласные += chars[i] + " ";
        }
        System.out.println(гласные);
        System.out.println(согласные);
        
    }
    public static boolean isVowels(char y){
        y = Character.toLowerCase(y);
        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == y){
                return true;
            }
        }
        return false;
    }

}
