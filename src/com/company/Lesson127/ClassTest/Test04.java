package com.company.Lesson127.ClassTest;

/**
 * Created by User on 16.10.2017.
 * * /*
 * 1. Создать интерфейс DBObject и создать в нем метод initializeIdAndName(long id, String name)
 * 3  Создать класс User c параметрами long id, String name; Вынести реализацию метода initializeIdAndName в класс User.
 * 4. initializeIdAndName в классе User должен возвращать тип User.
 * 5. Переопределить метод toString() в классе User, что бы он возвращал следующее User has name %s, id = %d
 * 6. Создать класс Matrix и создать в нем 2 объекта используя ранее созданые интерефейс и класс.
 * 7. В методе main вывести на экран объекты.
 */
public class Test04 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        System.out.println(matrix.user1);
        System.out.println(matrix.user2);
    }
}
interface DBobject{
   DBobject initializeIdandName(long id, String name);
}
class User implements DBobject{
    long id;
    String name;

    @Override
    public DBobject initializeIdandName(long id, String name) {
        this.id = id;
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return String.format("User has = %d, id = %s " , id , name) ;
    }
}
class Matrix{
    DBobject user1 = new User().initializeIdandName(1, "Neo");
    DBobject user2 = new User().initializeIdandName(2, "Switch");
}
