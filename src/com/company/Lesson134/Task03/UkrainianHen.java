package com.company.Lesson134.Task03;

/**
 * Created by User on 17.11.2017.
 */
public class UkrainianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 600;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна " + Country.ukrain + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц. ";
    }
}
