package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    // ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal iva;

    // COSTRUTTORI
    public Product(){
        this.code = generateCode();
    }
    public Product( String name, String description, BigDecimal price, BigDecimal iva) throws Exception {
        this.code = generateCode();
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
    public BigDecimal getIva() {
        return iva;
    }
    public BigDecimal getPrice() {
        return price;
    }

    //set

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    // METODI

    // metodo per creare un codice random
    private int generateCode(){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(0, 10000);
    }
    //metodo per ottenere nome esteso
    public String getFullProductName() {
        return code + " " + name;
    }

    //metodo per ottenere prezzo con iva
    public BigDecimal getFinalPrice() {
        BigDecimal ivaOnPrice = price.multiply(iva);
        return price.add(ivaOnPrice).setScale(2, RoundingMode.HALF_EVEN);
    }

    //metodi per controllare dati negativi

    // metodo 1 prezzo
    private void checkPrice (BigDecimal price) throws IllegalArgumentException {
        if(price == null || price.compareTo(new BigDecimal(0)) < 0) {
            throw new IllegalArgumentException("price negative " + price);
        }
    }
    private void checkIva (BigDecimal iva) throws IllegalArgumentException {
        if(iva == null || iva.compareTo(new BigDecimal(0))< 0){
            throw new IllegalArgumentException("vat negative " + iva);
        }
    }
    private void checkName (String name) throws Exception {
        if (name.isEmpty()) {
            throw new Exception("Inserisci il nome");
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
