package com.company.Lesson139.Task03;

/**
 * Created by User on 08.12.2017.
 * 1. Напиши интерфейс MusicalInstrument который наследует Runnable.
 2. В нем создай методы Date startPlaying и Date stopPlaying.
 3. Создай класс Violin так, чтоб он стал таском для нити. Используйте интерфейс MusicalInstrument
 4. Реализуй необходимый метод в нити Violin. Реализация должна быть следующей:
 4.1. Считай время начала игры - метод startPlaying().
 4.2. Подожди 1 секунду - метод sleepNSeconds(int n), где n - количество секунд.
 4.3. Считай время окончания игры - метод stopPlaying().
 4.4. Выведи на консоль продолжительность игры в миллисекундах. Пример "Playing 1002 ms".

 */
public class TestMain {
    public static void main(String[] args) {
        Violin violin = new Violin();
        Thread thread = new Thread(violin);
        thread.start();
    }
}
