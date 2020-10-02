package com.company;

public class Stol extends Mebel{
    private float area;
    public Stol(float price, String color, String texture, float area) {
        super(price, color, texture);
        this.area = area;
    }
    public float getArea() {
        return area;
    }

    @Override
    public String toString() {
        return this.color + " table made of " + this.texture + ":\n" +
                "Price: " + this.price + "\nArea: " + this.area;
    }
}
