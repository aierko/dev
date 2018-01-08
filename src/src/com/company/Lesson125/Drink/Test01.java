package com.company.Lesson125.Drink;

/**
 * Created by User on 09.10.2017.
 * /*
 * Создать интерфейс Drink и класс AlcoholicBeer
 * В интерфейсе Drink создай метод isAlcoholic();
 * Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
 * Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный", если isAlcoholic() возвращает true,
 * иначе вывести на экран надпись "Напиток безалкогольный".
 */
public class Test01 {
    public static void main(String[] args) {
             AlcoholicBeer alcoholicBeer = new AlcoholicBeer();
             System.out.println(alcoholicBeer);
    }

}

interface Drink {
    abstract boolean isAlcohollic();
}

class AlcoholicBeer implements Drink {
    @Override
    public boolean isAlcohollic() {
        return true;
    }

    @Override
    public String toString() {
        if (isAlcohollic()) {
            return " Напиток алкогольный ";
        } else return " Напиток безалкогольный ";

    }
}