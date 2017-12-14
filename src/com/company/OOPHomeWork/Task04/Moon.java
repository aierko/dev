package com.company.OOPHomeWork.Task04;

/**
 * Created by User on 12.12.2017.
 */
public final class Moon implements Planet {
    private static Moon moon = null;

    private Moon() {
    }
    public static synchronized Moon getMoon(){
        if (moon == null){
            moon = new Moon();
        }
        return moon;
    }
}
