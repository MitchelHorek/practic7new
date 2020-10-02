package com.company;

import java.util.ArrayList;

public class Person {
    ArrayList<Mebel> corzina = new ArrayList<>();
    public float cartSum() {
        float sum = 0f;
        for (Mebel furniture : corzina) {
            sum += furniture.getPrice();
        }
        return sum;
    }


}
