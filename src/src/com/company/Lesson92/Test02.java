package com.company.Lesson92;

/**
 * Created by user on 19.05.2017./* Перехватывание исключений
 1. Есть три исключения последовательно унаследованные от Exception:
 2. class Exception1 extends  Exception
 3. class Exception2 extends  Exception1
 4. class Exception3 extends  Exception2
 5. Есть метод, который описан так:
 5.1. public static void method1() throws Exception1, Exception2, Exception3

 6. Напиши catch, который перехватит все три Exception1, Exception2 и Exception3
 */
public class Test02 {
    public static void main(String[] args) throws Exception1 {
        try {
            method1();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        }
    }
    public static void method1() throws Exception1 {
        int number = (int) (Math.random() * 3 + 1);
        if (number == 1){
            throw new Exception1();
        }
        if (number == 2){
            throw new Exception2();
        }
        if (number == 3){
            throw new Exception3();
        }

    }


}
class Exception1 extends  Exception{}
class Exception2 extends  Exception1{}
class Exception3 extends  Exception2{}
