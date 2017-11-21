package com.company.Lesson134.Task01;

/**
 *  Напиши интерфейс Person.
 2. Создай классы Dancer и Player реализующие интерфейс с соответствующими методами.
 3. Создай метод haveRest так, чтобы он вызывал метод
 - play, если person имеет тип Player
 и dance, если person имеет тип Dancer
 */
public class Test01 {
    public static void main(String[] args) {
      Person player = new Player();
      Person dancer = new Dancer();
      haveRest(player);
      haveRest(dancer);
    }
    public static void haveRest(Person person){
        if (person instanceof Player){
            Player.player();
        }
        else if (person instanceof Dancer){
            Dancer.dancer();
        }
    }

}
interface Person{

}
