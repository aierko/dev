package com.company.Project;

import java.io.IOException;
import java.util.HashMap;

/**
 * Created by User on 22.12.2017.
 */
public class MaineShop {
    public static void main(String[] args) throws IOException {
        Client clients = new Client("Mark","Jakobs",true,50,500, "Kingston Av.", 1245664579);
        Product products = new Product("Coca-Cola", 231,4.55  );
        Coworker coworker = new Coworker("Carlo", "Despinoza",true, 29, " sales-manager");
        Holl holl = new Holl("59 Street",4,86, 230.5, true );
        HashMap<Integer,Product> productHashMap = new HashMap<>();
        productHashMap.put(products.getId(),products);
        productHashMap.put(2,new Product("Buritos",2,2.8));
        Product findedProduct = coworker.coworkerIssueOrder(coworker.coworkerAcceptOrder(clients),productHashMap);
        clients.getTheProducts(findedProduct);
    }

}
