package com.company.Lesson135.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 21.11.2017.
 * Написать интерфейс Person
 Создать классы User, Looser, Coder, Proger которые наследуют Person и реализуют свои методы.

 1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
 Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
 Ввод окончен, когда строка не совпадает ни с одной из вышеуказанных.

 2. Для каждой введенной строки нужно:
 2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
 2.2. Передать этот объект в метод doWork.

 3. Написать реализацию метода doWork, который:
 3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
 3.2. Вызывает метод doNothing(), если person имеет тип Looser.
 3.3. Вызывает метод coding(), если person имеет тип Coder.
 3.4. Вызывает метод enjoy(), если person имеет тип Proger.

 */
public class test03 {
   static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Person obj = null;
        String key = null;
        while (true){
             key = reader.readLine();
            if (key.contains("user")){
                obj = new User();
            }
            else if (key.contains("looser")){
                obj = new Looser();
            }
            else if (key.contains("coder")){
                obj = new Coder();
            }
            else if (key.contains("proger")){
                obj = new Proger();
            }
            else break;
            doWork(obj);
        }

    }
    public static void doWork(Person person){
            if (person instanceof Coder){
                ((Coder) person).coding();
            }
            if (person instanceof Looser){
                ((Looser) person).doNothing();
            }
            if (person instanceof User){
                ((User) person).live();
            }
            if (person instanceof Proger){
                ((Proger) person).enjoy();
            }
    }
}
