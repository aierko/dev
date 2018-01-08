package com.company.Lesson91;

/**
 * Created by user on 17.05.2017.
 * /* Перехватывание исключений
 1. Есть три исключения последовательно унаследованные от Exception:
 2. class Exception1 extends  Exception
 3. class Exception2 extends  Exception1
 4. class Exception3 extends  Exception2
 5. Есть метод, который описан так:
 5.1. public static void method1() throws Exception1, Exception2, Exception3

 6. Напиши catch, который перехватит все три Exception1, Exception2 и Exception3.
 */
public class Test07 {
    public static void main(String[] args) {
        try {
            truth();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        }
    }
    public static void truth() throws Exception1 {
        int a = (int) (Math.random() * 3);
        if(a == 0){
            throw new Exception1();
        }
        else if (a == 1){
            throw new Exception2();
        }
        if (a == 2){
            throw new Exception3();
        }
    }
}
class Exception1 extends  Exception{}
class Exception2 extends  Exception1{}
class Exception3 extends  Exception2{}
