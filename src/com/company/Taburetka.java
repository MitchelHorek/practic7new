package com.company;

public class Taburetka extends Mebel{
    private float height;

    public Taburetka(float price, String color, String material, float height) {
        super(price, color, material);
        this.height = height;
    }
    public float getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return this.color + " chair made of " + this.texture + ":\n" +
                "Price: " + this.price + "\nHeight: " + this.height;
    }

}
