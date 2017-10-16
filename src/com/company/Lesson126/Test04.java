package com.company.Lesson126;

/**
 * Created by User on 13.10.2017.
 * /* Пиво и кола
 Создать интерфейс Drink и классы Cola и Beer
 В интерфейсе Drink создай метод isAlcoholic();
 Реализуй интерфейс Drink в классах Beer и Cola.
 Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
 И вывести на экран соответствующую запись.
 */
public class Test04 {
    public static void main(String[] args) {
        Drinkable cola = new Cola();
        Drinkable beer = new Beer();
        print(cola);
        print(beer);

    }

    public static void print(Drinkable drinkable) {
        if (drinkable.isAlcoholic())
            System.out.println(drinkable.getClass().getSimpleName() + " drink non alcohol ");
       else
            System.out.println(drinkable.getClass().getSimpleName() + " drink is alcoholic ");
    }
}

 interface Drinkable {
    public boolean isAlcoholic();
 }
 class Cola implements Drinkable{
     @Override
     public boolean isAlcoholic() {
         return true;
     }
 }

 class Beer implements Drinkable{

     @Override
     public boolean isAlcoholic() {
         return false;
     }
 }
