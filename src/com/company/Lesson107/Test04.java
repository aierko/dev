package com.company.Lesson107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 08.08.2017.
 * /**
 * Created by User on 04.08.2017.
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
public class Test04 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        enterChars();
    }
      public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
      public static void enterChars() throws IOException {
          String vowel =  "";
          String consonents = "";
          char [] chars = reader.readLine().toCharArray();
          for (int i = 0; i <chars.length; i++) {
              if (isVovels(chars[i])){
                  vowel += chars[i] + " ";
              }
              else if (chars[i] == ' '){
                  continue;
              }
              else consonents += chars[i] + " ";
          }
          System.out.println(vowel);
          System.out.println(consonents);
      }
      public static boolean isVovels(char y){
          y = Character.toLowerCase(y);
          for (int i = 0; i <vowels.length ; i++) {
              if (vowels[i] == y ){
                  return true;
              }
          }
          return false;
      }
}
