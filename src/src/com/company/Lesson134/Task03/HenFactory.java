package com.company.Lesson134.Task03;

/**
 * Created by User on 17.11.2017.
 */
public class HenFactory {
    public static Hen getHen(String country) {
        Hen hen = null;
        if (country.equals(Country.belarussia)) {
            hen = new BelurassianHen();
        }
        if (country.equals(Country.moldova)) {
            hen = new MoldovanHen();
        }
        if (country.equals(Country.russia)) {
            hen = new RussianHen();
        }
        if (country.equals(Country.ukrain)) {
            hen = new UkrainianHen();
        }
        return hen;
    }
}
