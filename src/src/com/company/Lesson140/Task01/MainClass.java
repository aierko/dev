package com.company.Lesson140.Task01;

/**
 * Created by User on 12.12.2017.
 */
public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        Politic ivanov = new Politic("Ivanov");
        ivanov.join();
        Politic petrov = new Politic("Petrov");
        Politic sidorov = new Politic("Sidorov");
        while (ivanov.getCountSpeaches() + petrov.getCountSpeaches() + sidorov.getCountSpeaches() < totalCountSpeeches){

        }
        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);

    }
    static int totalCountSpeeches = 200;
    static int soundsInOneSpeech = 1000000;
}
