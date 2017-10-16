package com.company.Lesson126;

/**
 * Created by User on 13.10.2017.
 * /*
 * Создать интерфейс Drink и класс AlcoholicBeer
 * В интерфейсе Drink создай метод isAlcoholic();
 * Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
 * Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный", если isAlcoholic() возвращает true,
 * иначе вывести на экран надпись "Напиток безалкогольный".
 */
public class Test03 {
    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer);
    }

}

interface Drink {
    abstract boolean isAlcoholic();

}

class AlcoholicBeer implements Drink {
    @Override
    public boolean isAlcoholic() {
        return true;
    }

    @Override
    public String toString() {
        if (isAlcoholic()) {
            return " напій алкогольний ";
        } else {
            return " напій безалкогольний ";
        }

    }
}