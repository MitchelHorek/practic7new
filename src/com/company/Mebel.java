package com.company;

public abstract class Mebel {
    protected float price;
    protected String color;
    protected String texture;

    public Mebel(float price, String color, String texture){
        this.price = price;
        this.color = color;
        this.texture = texture;
    }

    public float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }
}
