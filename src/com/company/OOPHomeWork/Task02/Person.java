package com.company.OOPHomeWork.Task02;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 25.11.2017.
 */
public class Person {
    String name = null;
    private List<Money> allMoney;
    public List<Money> getAllMoney(){
        return allMoney;
    }

    public Person(String name,double Hriven, double USD) {
        this.name = name;
        this.allMoney = new ArrayList<Money>();
        this.allMoney.add(new Hrivna(Hriven));
        this.allMoney.add(new USD(USD));
    }

}
