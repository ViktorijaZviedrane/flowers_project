package com.company;

import java.util.Scanner;

public class Flowers {
    private String name;
    private String color;
    private int quantity;
    private int pricePerOne;

    public Flowers(String name, String color, int quantity, int pricePerOne) {
        this.name = name;
        this.color = color;
        this.quantity = quantity;
        this.pricePerOne = pricePerOne;
    }

    public String printInfo(){
        return "Flower - " + name + ", color - " + color + ", quantity - " + quantity + ", price per one - " + pricePerOne + "$";
    }
    public int price(){
        return quantity * pricePerOne;
    }

    public void order(){
        String nameForOrder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the desired quantity of flowers to order: ");
        int orderQuantity = sc.nextInt();
        quantity += orderQuantity;
        int price = pricePerOne * orderQuantity;
        switch (name){
            case "cactus":
                nameForOrder = "cactus";
                break;
            case "begonia":
                nameForOrder = "begonia";
                break;
            case "velveeta":
                nameForOrder = "velveeta";
                break;
            case "petunia":
                nameForOrder = "petunia";
                break;
            case "bellflower":
                nameForOrder = "bellflower";
                break;
            case "lupine":
                nameForOrder = "lupine";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }
        System.out.println("Now the quantity in the shop is " + quantity + " " + nameForOrder);
        System.out.println("The price for order will be - " + price + "$");
    }

    public String getName() {
        return name;
    }

    public void setName(String type) {
        this.name = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPricePerOne() {
        return pricePerOne;
    }

    public void setPricePerOne(int pricePerOne) {
        this.pricePerOne = pricePerOne;
    }
}
