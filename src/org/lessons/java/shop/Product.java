package org.lessons.java.shop;

public class Product {
    // ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private int price;
    private int iva

    // COSTRUTTORI

    public Product(int code, String name, String description, int price, int iva) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.iva = iva;
        this.price = price;
    }

    // GETTER E SETTER
    //get
    public int getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getIva() {
        return iva;
    }
    public int getPrice() {
        return price;
    }

    //set

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setIva(int iva) {
        this.iva = iva;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    // METODI

    //metodo per ottenere nome esteso
    public String getFullProductName() {
        return code + " " + name;
    }

    //metodo per ottenere prezzo con e senza iva

}
