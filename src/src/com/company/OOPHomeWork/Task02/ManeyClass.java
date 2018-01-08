package com.company.OOPHomeWork.Task02;

/**
 * Created by User on 28.11.2017.
 */
public class ManeyClass {
    public static void main(String[] args) {
        Person person = new Person("Kostya", 50,40);
        Person person1 = new Person("Sashko",90, 30);
        for (Money money: person.getAllMoney()) {
            System.out.println(person.name + "Have a cash " + money.getAmont() + money.getCurrencyName());
        }
        for (Money money :person1.getAllMoney()) {
            System.out.println(person1.name + "Have a cash " + money.getAmont() + money.getCurrencyName());
        }
    }
}
