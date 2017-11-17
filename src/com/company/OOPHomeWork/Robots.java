package com.company.OOPHomeWork;

/**
 * Created by User on 08.11.201
 * * /* Битва роботов
 * 1. Создать класс Robot, BodyPart интерфейсы Attackable,Defensable и абстрактный класс AbstractRobot
 * 2. В классе BodyPart создать переменную String bodyPart; добавить 4 объекта - части тела ( рука, нога, голова, грудь).
 * Сделать объекты неизменяемыми.
 * 3. В интерфейсе Attackable создать метод BodyPart attack();
 * 4. В интерфейсе Defensable создать метод BodyPart defense();
 * 5. В классе AbstractRobot создать переменные private String name; private static int hitCount;
 * 6 В классе AbstractRobot создать логику атаки и защиты. Реализовать интерфейсы Attackable и Defensable
 * 6.1 В методах attack() и defense() инициализировать переменную hitCount рандомным числом от 1 до 4.
 * В зависимости от результата инициализации должна быть атакована и защищена определенная часть тела робота.
 * 7. Унаследовать класс Robot от AbstractRobot. В классе Robot создать конструктор супер класса.
 * 8. В выполняющем классе создать метод doMove(AbstractRobot robotFirst, AbstractRobot robotSecond).
 * 8.1 В методе doMove реализовать логику вывода на экран надписи "%s атаковал робота %s, атакована %s, защищена %s"
 */
public class Robots {
    public static void main(String[] args) {

    }
}
class BodyPart{
    String bodyPart;
    BodyPart(String bodyPart){
        this.bodyPart = bodyPart;
    }
    static final BodyPart back = new BodyPart("Рука");
    static final BodyPart head = new BodyPart("Рука");
    static final BodyPart foot  = new BodyPart("Рука");
    static final BodyPart biceps = new BodyPart("Рука");
}
class Robot {
}

interface Attackable {
    BodyPart attack();
}

interface Defensable {
    BodyPart defense();
}

abstract class AbstractRobot {
    private String name;
    private static int hitCount;
}

