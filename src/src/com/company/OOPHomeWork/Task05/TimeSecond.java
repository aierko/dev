package com.company.OOPHomeWork.Task05;

/**
 * Created by User on 14.12.2017.Часы
 * 1. Создай статический класс Clock extends Thread, в конструкторе вызывай метод start().
 * 2. Реализуйте логику метода printTikTak:
 * 2.1. Через первые полсекунды должна выводиться в консоль фраза: Tik.
 * 2.2. Через вторые полсекунды должна выводиться в консоль фраза: Tak.
 * 3. Создай глобальную переменную boolean isStopped = false.
 * 4. В методе run() вызови метод printTikTak() пока isStopped = false.
 * 5. В методе main() выполни работу часов.
 */

public class TimeSecond {
    public static void main(String[] args) throws InterruptedException {
             Clock clock = new Clock();
             Thread.sleep(5000);
             isStopped = true;
    }
    static boolean isStopped = false;
    static class Clock extends Thread {
        public Clock() {
            start();
        }
        public static void printTikTak() throws InterruptedException {
            Thread.sleep(500);
                System.out.println("Tik");
            Thread.sleep(500);
            System.out.println("Tak");
        }

        @Override
        public void run() {
            while (isStopped == false){
                try {
                    printTikTak();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
