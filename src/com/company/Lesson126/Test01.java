package com.company.Lesson126;

/**
 * Created by User on 13.10.2017.
 * /* Или «Кошка», или «Собака», или «Птица», или «Лампа»
 Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
 */
public class Test01 {
    public static void main(String[] args) {
        Kitten kitten = new Kitten();
        Doggers doggers = new Doggers();
        Birds birds = new Birds();
        Lamps lamps = new Lamps();
        System.out.println(kitten);
        System.out.println(doggers);
        System.out.println(birds);
        System.out.println(lamps);
    }
    public static void findeObjectClass(Object object){
         if (object instanceof Kitten){
             System.out.println("Kitten");
         }else if (object instanceof Doggers){
             System.out.println("Doggers");
         }else if (object instanceof Birds){
             System.out.println("Birds");
         }else if (object instanceof Lamps){
             System.out.println("Lamp");
         }
    }
}
 class Kitten{}
 class Doggers{}
 class Birds{}
 class Lamps{}