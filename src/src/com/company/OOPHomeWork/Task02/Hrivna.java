package com.company.OOPHomeWork.Task02;

/**
 * Created by User on 25.11.2017.
 */
public class Hrivna extends Money {

    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    String getCurrencyName() {
        return "Hrivna";
    }
}
