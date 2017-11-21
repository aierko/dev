package com.company.Lesson134.Task03;

/**
 * Created by User on 17.11.2017.
 */
public class RussianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 50;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна " + Country.russia + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц. ";
    }
}
