package com.company.Lesson128.TestingOOP;

/**
 * Created by User on 20.10.2017.
 * /*
 * 1. Создать интерфейс DBObject и создать в нем метод initializeIdAndName(long id, String name)
 * 2. Создать класс User с параметрами long id, String name; Вынести реализацию метода initializeIdAndName в класс User.
 * 3. initializeIdAndName в классе User должен возвращать тип User.
 * 4. Переопределить метод toString() в классе User, что бы он возвращал следующее User has name %s, id = %d
 * 5. Создать класс Matrix и создать в нем 2 объекта используя ранее созданые интерефейс и класс.
 * 6. В методе main вывести на экран объекты.
 */
public class Test03 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        System.out.println(matrix.user1);
        System.out.println(matrix.user2);
    }

}

interface DBObject {
    DBObject initializeIdAndName(long id, String name);
}

class User implements DBObject {
    long id;
    String name;

    @Override
    public User initializeIdAndName(long id, String name) {
        this.id = id;
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return String.format(" User has id = %d, name = %s", id, name);
    }
}

class Matrix {
    DBObject user1 = new User().initializeIdAndName(1, "Greg");
    DBObject user2 = new User().initializeIdAndName(2, "Jony");
}
