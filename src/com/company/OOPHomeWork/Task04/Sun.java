package com.company.OOPHomeWork.Task04;

/**
 * Created by User on 12.12.2017.
 */
public final class Sun implements Planet {
    private static Sun sun = null;

    private Sun() {

    }

    public static synchronized  Sun getSun(){
         if (sun == null){
             sun = new Sun();
         }
         return sun;
    }
}
