package com.company.Lesson126.oop;

/**
 * Created by User on 13.10.2017.
 * /*
 1. Создать интерфейс DBObject и создать в нем метод initializeIdAndName(long id, String name)
 2. Создать класс User с параметрами long id, String name; Вынести реализацию метода initializeIdAndName в класс User.
 3. initializeIdAndName в классе User должен возвращать тип User.
 4. Переопределить метод toString() в классе User, что бы он возвращал следующее User has name %s, id = %d
 5. Создать класс Matrix и создать в нем 2 объекта используя ранее созданые интерефейс и класс.
 6. В методе main вывести на экран объекты.
 */
public class Test06 {
    public static void main(String[] args) {

    }
}
interface DBObject{
   String initializeIdAndName(long id, String name);
}
class User implements DBObject{
    long id;
    String name;

    @Override
    public String initializeIdAndName(long id, String name) {
        return  ("User has name %s, id = %d") + name + id;
    }
}
