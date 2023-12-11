package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Product{
    private int tvSize;
    private boolean smart;

    //costruttore

    public Televisori(String name, String description, BigDecimal price, BigDecimal iva, int tvSize, boolean smart) throws Exception {
        super(name, description, price, iva);
        this.tvSize = tvSize;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Televisori{" +
                "tvSize=" + tvSize +
                ", smart=" + smart +
                '}';
    }
}
