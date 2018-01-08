package com.company.Lesson136.Task03;

/**
 * Created by User on 24.11.2017.
 */
public class SingletoneClass {
   static SingletoneClass single = null;

    private SingletoneClass() {
    }
    static SingletoneClass getInstance(){
        if (single ==(null)){
            single = new SingletoneClass();
        }
        return single;

    }
}
