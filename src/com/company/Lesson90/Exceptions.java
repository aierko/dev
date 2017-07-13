package com.company.Lesson90;

/**
 * Created by user on 15.05.2017.
 * Throwable
 * - Exception checked/unchecked
 * - IOException checked
 * - RuntimeException unchecked
 * - Error unchecked
 * <p>
 * throws
 * try
 * catch
 * finally
 * throw
 */
public class Exceptions {
    public static void main(String[] args) {
        System.out.println("Run-1");

        try {
            System.out.println("Run-2");
            int a = 50 / 0;
            String s = null;
            s.toUpperCase();
            System.out.println("Try");
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Exception1 has been handled " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception2 has been handled " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Continue");
        System.out.println("Continue");
        System.out.println("Continue");
        System.out.println("Continue");
    }
}
