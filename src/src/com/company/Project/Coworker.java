package com.company.Project;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 22.12.2017.
 */
public class Coworker extends Human{

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    String position;

    public Coworker(String name, String second_name, boolean female_male, int old, String position) {
        super(name, second_name, female_male, old);
        this.position = position;
    }

    public int coworkerAcceptOrder(Client client) throws IOException {
        int orders = client.findeProducts();
        return orders;
    }
    public Product coworkerIssueOrder(int id, HashMap<Integer,Product> products){
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            if (entry.getKey() == id){
                return entry.getValue();
            }
        }
          return null;
    }

}
