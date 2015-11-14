package com.example.alienware.feedmepizza.objects;

/**
 * Created by Alienware on 11/14/2015.
 */
public class pizzaPlaces {
    String Name;
    String Toppings; //TODO change from String to array of Toppings
    String Drinks; //TODO change from String to array of drinks
    double pizzaPrice;
    double ToppingPrice1;
    double ToppingPrice2;

    public pizzaPlaces(String name, String toppings, String drinks, double pizzaPrice, double toppingPrice1, double toppingPrice2) {
        Name = name;
        Toppings = toppings;
        Drinks = drinks;
        this.pizzaPrice = pizzaPrice;
        ToppingPrice1 = toppingPrice1;
        ToppingPrice2 = toppingPrice2;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getToppings() {
        return Toppings;
    }

    public void setToppings(String toppings) {
        Toppings = toppings;
    }

    public String getDrinks() {
        return Drinks;
    }

    public void setDrinks(String drinks) {
        Drinks = drinks;
    }

    public double getPizzaPrice() {
        return pizzaPrice;
    }

    public void setPizzaPrice(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public double getToppingPrice1() {
        return ToppingPrice1;
    }

    public void setToppingPrice1(double toppingPrice1) {
        ToppingPrice1 = toppingPrice1;
    }

    public double getToppingPrice2() {
        return ToppingPrice2;
    }

    public void setToppingPrice2(double toppingPrice2) {
        ToppingPrice2 = toppingPrice2;
    }

}
