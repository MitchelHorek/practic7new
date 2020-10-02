package com.company;

public class Sofa extends Mebel {
    private final String space;

    public Sofa(float price, String color, String material, String space) {
        super(price, color, material);
        this.space = space;
    }

    public String getSpace() {
        return space;
    }

    @Override
    public String toString() {
        return this.color + " sofa made of " + this.texture + ":\n" +
                "Price: " + this.price + "\nSpace: " + this.space;
    }
}
