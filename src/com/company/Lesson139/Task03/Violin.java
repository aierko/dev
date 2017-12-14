package com.company.Lesson139.Task03;

import java.util.Date;

/**
 * Created by User on 08.12.2017.
 */
public class Violin implements MusicalInstrument {
    @Override
    public Date startPlaying() {
        System.out.println("Time start playing");
        return new Date();
    }

    @Override
    public Date stopPlaying() {
        System.out.println("Time stop playing");
        return new Date();
    }

    @Override
    public void run() {
       Date start = startPlaying();
        try {
            sleepNSecconds(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date finish = stopPlaying();
        System.out.println(finish.getTime()- start.getTime());
    }

    public void sleepNSecconds(int n) throws InterruptedException {
        Thread.sleep(n * 1000);
    }
}
