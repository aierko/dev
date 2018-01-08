package com.company.Lesson92;

import java.io.IOException;
import java.rmi.RemoteException;

/**
 * Created by user on 19.05.2017.
 * /* Перехват checked исключений
 * В методе processExceptions обработайте все checked исключения.
 * IOException
 * RemoteException
 * NoSuchFieldException
 * Нужно вывести на экран каждое возникшее checked исключение.
 * Можно использовать только один блок try..
 */
public class Test04 {
    public static void main(String[] args) {
        processExeptions();
    }

    public static void processExeptions() {
        try {
            rem();
            no();
            io();
        } catch (RemoteException e) {
            System.out.println("R");
        } catch (NoSuchFieldException e) {
            System.out.println("N");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void rem() throws RemoteException {
        throw new RemoteException();
    }

    public static void io() throws IOException {
        throw new IOException();
    }

    public static void no() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }
}
