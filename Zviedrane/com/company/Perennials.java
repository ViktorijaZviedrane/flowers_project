package com.company;

public class Perennials extends Flowers {
    private int floweringTime;

    public Perennials(String name, String color, int quantity, int pricePerOne, int floweringTime) {
        super(name, color, quantity, pricePerOne);
        this.floweringTime = floweringTime;
    }

    public String printInfo(){
        return "Flower - " + getName() + ", color - " + getColor() + ", quantity - " + getQuantity() + ", price per one - " + getPricePerOne() + "$" + ", flowering time - " + floweringTime + "months";
    }

    public int price(){
        int price = getQuantity() * getPricePerOne();
        return price;
    }

    public int isFloweringTime() {
        return floweringTime;
    }

    public void setFloweringTime(int floweringTime) {
        this.floweringTime = floweringTime;
    }
}
