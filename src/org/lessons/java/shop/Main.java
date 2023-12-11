package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            Product bag = new Product( "Alfredo", "ha i problemi", new BigDecimal(19.99), new BigDecimal(0.22));
            System.out.println("prodotto: " + bag.getFullProductName() + " " + "il prezzo è: " + bag.getFinalPrice());
        } catch (Exception e) {
            System.out.println(e.getMessage());


        }
    }
}
