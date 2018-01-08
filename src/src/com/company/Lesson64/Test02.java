package com.company.Lesson64;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 24.02.2017.
 * /* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
 Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
 Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
 */
public class Test02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        System.out.println(getTimeMsOfInsert10k(list));
        System.out.println(getTimeMsOfInsert10k(list1));
    }

    public static void insert10k(List<Integer> list){
        for (int i = 0; i < 100000; i++) {
            list.add(0,7);
        }
    }
    public static long getTimeMsOfInsert10k(List<Integer> list){
        Date date = new Date();
        insert10k(list);
        Date date1 = new Date();
        long ms = date1.getTime() - date.getTime();
        return ms;
    }

}
