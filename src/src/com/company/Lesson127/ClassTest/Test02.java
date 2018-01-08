package com.company.Lesson127.ClassTest;

/**
 * Created by User on 16.10.2017.
 * /*
 * Создать интерфейс Drink и класс AlcoholicBeer
 * В интерфейсе Drink создай метод isAlcoholic();
 * Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
 * Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный", если isAlcoholic() возвращает true,
 * иначе вывести на экран надпись "Напиток безалкогольный".
 */
public class Test02 {
    public static void main(String[] args) {
        Drink drink = new AlcoholicBeer();
        System.out.println(drink);
    }

}

interface Drink {
    boolean isAlcoholicBeer();

}

class AlcoholicBeer implements Drink {

    @Override
    public boolean isAlcoholicBeer() {
        return true;
    }

    @Override
    public String toString() {
        if (isAlcoholicBeer()) {
            return " Напиток алкогольный ";
        } else
            return " Напиток безалкогольный ";
    }
}

