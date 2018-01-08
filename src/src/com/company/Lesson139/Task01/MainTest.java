package com.company.Lesson139.Task01;

/**
 * Created by User on 08.12.2017.C
 Создать public class TestThread - нить с помощью интерфейса Runnable.
 TestThread должен выводить в консоль "My first thread"
 */
public class MainTest {
    public static void main(String[] args) {
        TestTread thread = new TestTread();
        Thread threadA = new Thread(thread);
        threadA.start();
    }
}
