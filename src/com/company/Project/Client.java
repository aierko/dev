package com.company.Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 22.12.2017.
 */
public class Client extends Human {
    private int money;
    private String address;
    private long telephone;

    public Client(String name, String second_name, boolean female_male, int old, int money, String address, long telephone) {
        super(name, second_name, female_male, old);
        this.money = money;
        this.address = address;
        this.telephone = telephone;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public int findeProducts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int product = Integer.parseInt(reader.readLine());
        return product;
    }

    public void getTheProducts(Product product) {
        System.out.println("address delivery" + address + product.getName());
    }
}
