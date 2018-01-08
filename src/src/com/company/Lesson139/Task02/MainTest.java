package com.company.Lesson139.Task02;

/**
 * Created by User on 08.12.2017.
 * 1. Создать public класс TestThread унаследовавшись от класса Thread.
 2. Создать статик блок внутри TestThread, который выводит в консоль "it's static block inside TestThread".
 3. Метод run должен выводить в консоль "it's run method".

 */
public class MainTest {
    public static void main(String[] args) {
        TestThread test = new TestThread();
        test.start();
    }
}
