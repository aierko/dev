package com.company.Lesson64;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 24.02.2017.
 * ArrayList ( get, set )
 * ... 498[] 499[] 500[] 501[] ...
 * LinkedList ( remove, insert )
 * ... - [] - [] - [] - [] - ...
 * /* Провести 10 тысяч вставок, удалений
 Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
 */
public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        insert10k(list);
        get10k(list);
        set10k(list);
        remove10k(list);
        List<Integer> list1 = new LinkedList<>();
        insert10k(list1);
        get10k(list1);
        set10k(list1);
        remove10k(list1);
    }
    public static void insert10k (List<Integer> list){
        for (int i = 0; i < 10000; i++) {
            list.add(0, 5);
        }
    }
    public static void remove10k(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.remove(0);
        }
    }
    public static void get10k(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }
    public static void set10k(List<Integer> list){
        for (int i = 0; i < 10000; i++) {
            list.set(i,5);
        }
    }

}
