package com.company.OOPHomeWork.Task05;

import java.util.Date;

/**
 * Created by User on 14.12.2017.Часы
 1. Создай статический класс Clock extends Thread, в конструкторе вызывай метод start().
 2. Реализуйте логику метода printTikTak:
 2.1. Через первые полсекунды должна выводиться в консоль фраза: Tik.
 2.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak.
 3. Создай глобальную переменную boolean isStopped = false.
 4. В методе run() вызови метод printTikTak() пока isStopped = false.
 5. В методе main() выполни работу часов.
 *
 */

  final class Clock extends Thread {
      static boolean isStopped = false;
    public Clock() {
        start();
    }
    private static void printTikTak{
        Date.from();
    }

    @Override
    public void run() {

    }
}
