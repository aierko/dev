package com.company.Lesson125.Drink2;

/**
 * Created by User on 09.10.2017.
 * /* Пиво и кола
 Создать интерфейс Drink и классы Cola и Beer
 В интерфейсе Drink создай метод isAlcoholic();
 Реализуй интерфейс Drink в классах Beer и Cola.
 Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
 И вывести на экран соответствующую запись.
 */
public class Test01 {
    public static void main(String[] args) {

    }

}
interface Drink {
    abstract boolean isAlcoholic();

}
class Cola implements Drink {

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}
class Beer implements Drink {

    @Override
    public boolean isAlcoholic() {
        return false;
    }

}

