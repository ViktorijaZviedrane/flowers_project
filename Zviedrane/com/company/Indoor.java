package com.company;

public class Indoor extends Flowers{
    private int temperature;

    public String printInfo(){
        return "Flower - " + getName() + ", color - " + getColor() + ", quantity - " + getQuantity() + ", price per one - " + getPricePerOne()  + "$" + ", temperature - " + temperature;
    }

    public int price(){
        int price = getQuantity() * getPricePerOne();
        return price;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Indoor(String name, String color, int quantity, int pricePerOne, int temperature) {
        super(name, color, quantity, pricePerOne);
        this.temperature = temperature;
    }
}
