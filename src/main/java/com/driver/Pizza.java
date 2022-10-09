package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean isAddedCheese;
    private Boolean isAddedToppings;
    private Boolean isAddedTakeaway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.bill = "";
        this.price = isVeg ? 300 : 400;
        this.isAddedCheese = false;
        this.isAddedTakeaway = false;
        this.isAddedToppings = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isAddedCheese)
        this.price += 80;
        this.isAddedCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isAddedToppings)
        this.price += (this.isVeg ? 70 : 120);
        this.isAddedToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isAddedTakeaway)
        this.price += 20;
        this.isAddedTakeaway = true;
    }

    public String getBill(){
        // your code goes here
        this.bill += "Base Price Of The Pizza: " + (this.isVeg ? 300 : 400);
        if(isAddedCheese)
        this.bill += "\nExtra Cheese Added: " + 80;
        if(isAddedToppings)
        this.bill += "\nExtra Toppings Added: " + (this.isVeg ? 70 : 120);
        if(isAddedTakeaway)
        this.bill += "\nPaperbag Added: " + 20;
        this.bill += "\nTotal Price: " + this.price;
        return this.bill;
    }
}
