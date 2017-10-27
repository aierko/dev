package com.company.Lesson129.LessRepit;

/**
 * Created by User on 25.10.2017.
 * /* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
 * Написать метод, который определяет, объект какого класса ему передали,
 * и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println(isWiichAnimal(new Korova()));
        System.out.println(isWiichAnimal(new Kit()));
        System.out.println(isWiichAnimal(new Sobaka()));
        System.out.println(isWiichAnimal(new Kot()));
    }

    public static String isWiichAnimal(Object object) {
        if (object instanceof Korova) {
            return " Korova ";
        } else if (object instanceof Kit) {
            return " Kit ";
        }else if (object instanceof Sobaka){
            return " Sobaka ";
        } return  " Alien ";
    }
}

class Korova {
}

class Kit {
}

class Sobaka {
}

class Kot {
}
