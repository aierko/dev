package com.company.Lesson68;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 08.03.2017./* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
 * Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
 * Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        System.out.println(getTimeMsOfInsert(list));
        System.out.println(getTimeMsOfInsert(list1));
    }

    public static void insert(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, 7);
        }
    }

    public static long getTimeMsOfInsert(List<Integer> list) {
        Date startDate = new Date();
        insert(list);
        Date endDate = new Date();
        long timeWork = endDate.getTime() - startDate.getTime();
        return timeWork;
    }
}
