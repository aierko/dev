package com.company.Lesson91;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Created by user on 17.05.2017./* Исключения
 Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
 NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.
 Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
 ArithmeticException и URISyntaxException.
 */
public class Test06 {
    public static void main(String[] args) throws URISyntaxException {
        try {
            closer();
        } catch (NullPointerException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void closer() throws FileNotFoundException, URISyntaxException {
        int number = (int) (Math.random() * 4 + 1);
        if (number == 1){
            throw new NullPointerException();
        }
        else if (number == 2){
            throw new ArithmeticException();
        }
        if (number == 3){
            throw new FileNotFoundException();
        }
        else if (number == 4){
            throw new URISyntaxException("","");
        }
    }
}
