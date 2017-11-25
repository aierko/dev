package com.company.OOPHomeWork.Task01;

/**
 * Created by User on 24.11.2017.
 * 1. Создай интерфейс CompItem.
 * 2. Добавь в него метод String getName().
 * 3. Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem.
 * 4. Метод getName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard".
 * 5. Создай класс Computer.
 * 6. В класс Computer добавь приватное поле типа Keyboard.
 * 7. В класс Computer добавь приватное поле типа Mouse.
 * 8. В класс Computer добавь приватное поле типа Monitor.
 * 9. Создай конструктор в классе Computer используя комбинацию клавиш Alt+Insert внутри класса (команда Constructor).
 * 10. Параметрами конструктора выбери все три поля (переменных) класса.
 * 11. Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert и выбери команду Getter).
 * 12. Все созданные классы и интерфейс должны быть в отдельных файлах.
 * 13. Класс Solution менять нельзя.
 * public class Solution
 * {
 * <p>
 * public static void main(String[] args)
 * {
 * Computer computer = new Computer();
 * if (isWork(computer.getKeyboard()) &&
 * isWork(computer.getMonitor()) &&
 * isWork(computer.getMouse()))
 * {
 * System.out.println("Work!");
 * }
 * }
 * <p>
 * public static boolean isWork(CompItem item)
 * {
 * System.out.println(item.getName());
 * return item.getName() != null && item.getName().length() > 4;
 * }
 * <p>
 * }
 */
public class Solutions {
    public static void main(String[] args) {
        Computer computer = new Computer();
        if (isWork(computer.getKeyBoard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse())) {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item) {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

}










