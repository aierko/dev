package com.company.Lesson31;

/**
 * [27 ноября 2016 г. 13:46] Артем Воров:
 * <p>
 * <Реализовать метод checkInterval.
 * Метод должен проверять попало ли целое число в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
 * "Число а не содержится в интервале."
 * или "Число а содержится в интервале.", где а - аргумент метода.
 */
public class CheckInterval {
    public static void main(String[] args) {
        checkInterval(98);

    }

    public static void checkInterval(int a) {
        if (a > 50 && a < 100) {
            System.out.println("Число " + a + " содержится в интервале.");
        } else {
            System.out.println("Число " + a + " не содержится в интервале");
        }


    }
}