package com.company.Lesson141.Task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 19.12.2017.1. Считаем секунды
 * <p>
 * 1. Создай статик класс Stopwatch extends Thread с приватной переменной int seconds.
 * 2. Напиши реализацию метода run в нити Stopwatch (секундомер).
 * 3. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
 * 4. Выведи количество секунд в консоль.
 */
public class Test01 {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        String read = reader.readLine();
        stopwatch.interrupt();
    }

    static class Stopwatch extends Thread {
        int second;

        public void run() {
            while (true) {
                try {
                    Thread.sleep(1000);
                    second ++;
                } catch (InterruptedException e) {
                    System.out.println(second);
                }

            }
        }

    }

}
