package com.company.Lesson90;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * Created by user on 17.05.2017.
 */
public class Exaple {
    public static class NewClass {
        public static void main(String[] args) throws MyException {

            int result = 0;

            try {
                result = getAreaValue(-1, 100);
            } catch (IllegalArgumentException e) {
                Logger.getLogger(NewClass.class.getName()).log(new LogRecord(Level.WARNING,
                        "В метод вычисления площади был передан аргумент с негативным значением!"));
                throw new MyException(e);
            }
            System.out.println("Result is : " + result);
        }

        private static class MyException extends Throwable {
            public MyException(Object e) {
            }
        }
    }

    private static int getAreaValue(int i, int i1) {

        return 0;
    }
}