package com.company;

public class FurnitureShop {
    Mebel[] furnitureShop = new Mebel[3];

    private void setFurnitureShop() {
        furnitureShop[0] = new Taburetka( 59.99f, "Black", "oak", 1.5f);
        furnitureShop[1] = new Stol(19.99f, "White", "birch", 0.8f);
        furnitureShop[2] = new Sofa(109.99f, "Red", "leather", "single");
    }

    public Mebel buyFurniture(int index) {
        return furnitureShop[index - 1];
    }

    public void run() {
        setFurnitureShop();
        System.out.println("Assortment:");
        int i = 0;
        for (Mebel furniture : furnitureShop) {
            System.out.print(++i + ". ");
            System.out.println(furniture);
        }
    }
}
