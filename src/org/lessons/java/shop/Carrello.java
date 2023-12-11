package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner keyScanner = new Scanner(System.in);
        System.out.println("Benvenuto nel carrello");

        List<Product> products = new ArrayList<>();

        boolean stop = false;
        while (!stop) {

            System.out.println("vuoi aggiungere un prodotto al carrello? (y/n)");
            String choice = keyScanner.nextLine();
            if (choice.equals("y")) {
                System.out.println("Telefono, Televisore o Cuffie ?");
                String userChoice = keyScanner.nextLine();

                switch (userChoice) {
                    case "Telefono":
                        try {
                            Smartphone telefono = new Smartphone("iphone", "ultimo modello", new BigDecimal(100), new BigDecimal(0.22), 123456, 32);
                            products.add(telefono);
                            System.out.println("aggiunto al carrello");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "Televisore":
                        try {
                            Televisori televisore = new Televisori("Samsung", "ultra piatto", new BigDecimal(150), new BigDecimal(0.22), 57, true);
                            products.add(televisore);
                            System.out.println("aggiunto al carrello");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case "Cuffie":
                        try {
                            Cuffie cuffie = new Cuffie("Beats", "ultimo modello", new BigDecimal(89), new BigDecimal(0.22), "Bianco", true, false);
                            products.add(cuffie);
                            System.out.println("aggiunto al carrello");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                }

            } else {
                System.out.println("ecco il tuo carrello");
                System.out.println(products);
                stop = true;
            }

        }
        keyScanner.close();
    }
}
