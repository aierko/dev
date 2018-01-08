package com.company.Lesson134.Task03;

/**
 * Created by User on 17.11.2017.
 */
public class MoldovanHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 550;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна " + Country.moldova + " Я несу " + getCountOfEggsPerMonth() + " яиц в месяц. ";
    }
}
