package com.company.Lesson141.Task01;

/**
 * Created by User on 19.12.2017.
 * 2. Отсчет на гонках
 * 1. В классе Solution напиши public static volatile int countSeconds = 3
 * 2. Создай статический класс RacingClock extends Thread.
 * 3. Реализуй логику метода run так, чтобы каждую секунду через пробел
 * выдавался отсчет начиная с countSeconds до 1, а потом слово [Марш!] (см примеры).
 * 4. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].
 * Пример для countSeconds=4 : [4 3 2 1 Прервано!]
 * 5. Если нить работает менее 3.5 секунд, она должна завершиться сама.
 * Пример для countSeconds=3 : [3 2 1 Марш!]
 * PS: метод sleep выбрасывает InterruptedException.
 */
public class Test02 {
    public static void main(String[] args) throws InterruptedException {
        RacingClock racingClock = new RacingClock();
        racingClock.start();
        Thread.sleep(2100);
        racingClock.interrupt();
    }
    public static volatile int countSeconds = 3;
    static class RacingClock extends Thread{
        public void run(){
            try {
            while (countSeconds > 0){
                System.out.println(countSeconds);
                    Thread.sleep(1000);
                countSeconds --;
            }
            System.out.println("Marsh");
            } catch (InterruptedException e) {
                System.out.println("Прервано");
            }
        }

    }
}
