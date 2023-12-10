package org.lessons.java.shop;

public class Product {
    // ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private Double price;
    private int iva;

    // COSTRUTTORI

    public Product(int code, String name, String description, Double price, int iva) throws Exception {
        this.code = code;
        checkName(name);
        this.name = name;
        this.description = description;
        checkIva(iva);
        this.iva = iva;
        checkPrice(price);
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
    public Double getPrice() {
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
    public void setPrice(Double price) {
        this.price = price;
    }

    // METODI

    //metodo per ottenere nome esteso
    public String getFullProductName() {
        return code + " " + name;
    }

    //metodo per ottenere prezzo con iva
    public Double getFinalPrice() {
        return price + (price * iva/100);
    }

    //metodi per controllare dati negativi

    // metodo 1 prezzo
    private void checkPrice (Double price) throws Exception {
        if (price < 0 ) {
            throw new Exception("Prezzo non valido");
        }
    }
    private void checkIva (int iva) throws Exception {
        if (iva < 0) {
            throw new Exception("Iva non valida");
        }
    }
    private void checkName (String name) throws Exception {
        if (name.isEmpty()) {
            throw new Exception("Inserisci il nome");
        }
    }
}
