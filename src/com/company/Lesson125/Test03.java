package com.company.Lesson125;

/**
 * Created by User on 09.10.2017.
 * /* Или «Кошка», или «Собака», или «Птица», или «Лампа»
 Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
 */
public class Test03 {
    public static void main(String[] args) {
          method(new Koshka());
          method(new Sobaka());
          method(new Ptica());
          method(new Lampa());
    }
    public static void method(Object obj){
        if (obj instanceof Koshka){
            System.out.println(" Koshka");
        }else if (obj instanceof Sobaka){
            System.out.println(" Sobaka");
        }else if (obj instanceof Ptica){
            System.out.println(" Ptica");
        }else if (obj instanceof Lampa){
            System.out.println(" Lampa");
        }
    }

}
class Koshka{}
class Sobaka{}
class Ptica {}
class Lampa {}
