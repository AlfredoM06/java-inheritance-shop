package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product{
    private int codeImei;
    private int memory;

    //costruttore

    public Smartphone(String name, String description, BigDecimal price, BigDecimal iva, int codeImei, int memory) throws Exception{
        super(name, description, price, iva);
        this.codeImei = codeImei;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "codeImei=" + codeImei +
                ", memory=" + memory +
                '}';
    }

}
