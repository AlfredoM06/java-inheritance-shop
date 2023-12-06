package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Product bag = new Product(23, "Alfredo", "ha i problemi", 19.99, 22 );
        System.out.println("prodotto: " + bag.getFullProductName() + " " + "il prezzo è: " + bag.getFinalPrice());

    }
}
