package com.company.Lesson92;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Created by user on 19.05.2017.
 * /* Исключения
 Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
 NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

 Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
 ArithmeticException и URISyntaxException.
 */
public class Test01 {
    public static void main(String[] args) throws URISyntaxException {
        try {
            nulPoint();
        } catch (FileNotFoundException | NullPointerException e) {
            e.printStackTrace();
        }
    }
    public static void nulPoint() throws FileNotFoundException, URISyntaxException {
        int core = (int) (Math.random() * 4) + 1;
        if ( core  == 1){
            throw new NullPointerException();
        }
        if ( core == 2){
            throw new ArithmeticException();
        }
        if (core == 3){
            throw new FileNotFoundException();
        }
        if (core == 4) {
            throw new URISyntaxException(" "," ");
        }
    }
}
