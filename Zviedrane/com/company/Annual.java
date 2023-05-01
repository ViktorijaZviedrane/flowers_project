package com.company;

public class Annual extends Flowers {
    public int flowerHeight;

    public String printInfo(){
        return "Flower - " + getName() + ", color - " + getColor() + ", quantity - " + getQuantity() + ", price per one - " + getPricePerOne()  + "$" + ", flower height - " + flowerHeight + "cm";
    }

    public int price(){
        int price = getQuantity() * getPricePerOne();
        return price;
    }

    public int getFlowerHeight() {
        return flowerHeight;
    }

    public void setFlowerHeight(int flowerHeight) {
        this.flowerHeight = flowerHeight;
    }

    public Annual(String name, String color, int quantity, int pricePerOne, int flowerHeight) {
        super(name, color, quantity, pricePerOne);
        this.flowerHeight = flowerHeight;
    }
}
