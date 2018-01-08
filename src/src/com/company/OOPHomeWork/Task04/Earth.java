package com.company.OOPHomeWork.Task04;

/**
 * Created by User on 12.12.2017.
 */
public final class Earth implements Planet{
    private static Earth earth = null;

    private Earth() {
    }
    public static synchronized Earth getEarth(){
        if (earth == null){
            earth = new Earth();
        }
        return earth;
    }
}
