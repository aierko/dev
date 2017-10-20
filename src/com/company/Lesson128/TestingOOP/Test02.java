package com.company.Lesson128.TestingOOP;

/**
 * Created by User on 20.10.2017.
 * /* Пиво и кола
 Создать интерфейс Drink и классы Cola и Beer
 В интерфейсе Drink создай метод isAlcoholic();
 Реализуй интерфейс Drink в классах Beer и Cola.
 Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
 И вывести на экран соответствующую запись.
 */
public class Test02 {
    public static void main(String[] args) {
         Cola cola = new Cola();
         Beer beer = new Beer();
         print(cola);
         print(beer);
    }
    public static void print(Drink drink){
        if (drink.isAlcoholic()){
            System.out.println(drink.getClass().getSimpleName() + " напиток алкогольный " );
        }else System.out.println(drink.getClass().getSimpleName() + " напиток безалкогольнный ");


    }
}
interface Drink{
    boolean isAlcoholic();
}
class Cola implements Drink{
    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
class Beer implements Drink{
    @Override
    public boolean isAlcoholic() {
        return true;
    }
}

