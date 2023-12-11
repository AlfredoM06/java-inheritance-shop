package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Product{
    private String color;
    private boolean wireless;
    private boolean cabled;

    //costruttore

    public Cuffie(String name, String description, BigDecimal price, BigDecimal iva, String color, boolean wireless, boolean cabled) throws Exception {
        super(name, description, price, iva);
        this.color = color;
        this.wireless = wireless;
        this.cabled = cabled;

    }

    @Override
    public String toString() {
        return "Cuffie{" +
                "color='" + color + '\'' +
                ", wireless=" + wireless +
                ", cabled=" + cabled +
                '}';
    }
}
