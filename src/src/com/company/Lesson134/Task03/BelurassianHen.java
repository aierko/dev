package com.company.Lesson134.Task03;

/**
 * Created by User on 17.11.2017.
 */
public class BelurassianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 300;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна " + Country.belarussia + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц. ";
    }
}
