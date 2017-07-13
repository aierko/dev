package com.company.Lesson72;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 21.03.2017./* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
 * Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
 * Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
 */
public class Test02 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr1 = new LinkedList<>();
        System.out.println(getTimeMsOfGet(addList(arr)));
        System.out.println(getTimeMsOfGet(addList(arr1)));
    }

    public static List addList(List<Integer> list){
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }

        return list;
    }

    public static void getTime(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.get(5000);
        }
    }
    public static long getTimeMsOfGet(List<Integer> list){
        Date theBegin = new Date();
        getTime(list);
        Date theEnd = new Date();
        long timeGet = theEnd.getTime() - theBegin.getTime();
        return timeGet;
    }
}