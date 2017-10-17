package com.company.Lesson127.ClassTest;

/**
 * Created by User on 16.10.2017.
 * /* Пиво и кола
 Создать интерфейс Drink и классы Cola и Beer
 В интерфейсе Drink создай метод isAlcoholic();
 Реализуй интерфейс Drink в классах Beer и Cola.
 Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
 И вывести на экран соответствующую запись.
 */
public class Test03 {
    public static void main(String[] args) {
        Drinker cola = new Cola();
        Drinker beer = new Beer();
        print(cola);
        print(beer);
    }
    public static void print(Drinker drink){
        if (drink.isAlcoholic()){
            System.out.println(" Drink is alcoholic ");
        }
        else System.out.println(" Non alcohol ");
    }

}
interface Drinker{
    boolean isAlcoholic();
}
class Cola implements Drinker{

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
class Beer implements Drinker{

    @Override
    public boolean isAlcoholic() {
        return true;
    }
}
