package com.company.Lessona130;

/**
 * Created by User on 30.10.2017.
 * /* Битва роботов
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
public class Test04 {
    public static void main(String[] args) {
        Robot robot = new Robot("jarvis");
        Robot robot1 = new Robot("valli");
        RobotZaika robotZaika = new RobotZaika();
        doMove(robot, robot1);
        doMove(robot1, robot);
        doMove(robot, robot1);
        doMove(robot1, robot);

    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defensed = robotSecond.defense();

        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s"
                , robotFirst.getName()
                , robotSecond.getName()
                , attacked
                , defensed));

        if (attacked.equals(defensed)) {
            System.out.println(String.format("%s не нанес урон %s", robotFirst.getName(), robotSecond.getName()));
        } else
            System.out.println(String.format("%s нанес урон %s по %s", robotFirst.getName(), robotSecond.getName(), attacked));

    }

}

class Robot extends AbstractRobot {

    Robot(String name) {
        super(name);
    }

}

class BodyPart {
    String bodyPart;

    BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    static final BodyPart hand = new BodyPart(" Hand ");  //?
    static final BodyPart leg = new BodyPart(" Leg ");
    static final BodyPart head = new BodyPart(" Head ");
    static final BodyPart breast = new BodyPart(" Breast ");

    @Override
    public String toString() {
        return bodyPart;
    }
}

interface Attackbale {
    BodyPart attack();
}

interface Defensable {
    BodyPart defense();
}

abstract class AbstractRobot implements Attackbale, Defensable {
    private String name;
    private static int count;

    AbstractRobot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public BodyPart attack() {
        count = (int) (Math.random() * 4 + 1); //?? [0;1)  [0*4+1;1*4+1)
        if (count == 1) {
            return BodyPart.hand;
        } else if (count == 2) {
            return BodyPart.leg;
        } else if (count == 3) {
            return BodyPart.head;
        } else if (count == 4) {
            return BodyPart.breast;
        }
        return BodyPart.head;
    }

    @Override
    public BodyPart defense() {
        count = (int) (Math.random() * 4 + 1);
        if (count == 1) {
            return BodyPart.hand;
        } else if (count == 2) {
            return BodyPart.leg;
        } else if (count == 3) {
            return BodyPart.head;
        } else if (count == 4) {
            return BodyPart.breast;
        }
        return BodyPart.head;

    }

}

class RobotZaika implements Attackbale, Defensable {

    @Override
    public BodyPart attack() {
        return null;
    }

    @Override
    public BodyPart defense() {
        return null;
    }
}

