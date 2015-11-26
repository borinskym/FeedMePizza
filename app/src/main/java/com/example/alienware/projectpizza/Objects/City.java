package com.example.alienware.projectpizza.Objects;

import java.util.List;

/**
 * Created by user on 26/11/2015.
 */
public class City {

    String name;
    List <PizzaPlace> pizzaPlaceList;

    public City(String name, List<PizzaPlace> pizzaPlaceList) {
        this.name = name;
        this.pizzaPlaceList = pizzaPlaceList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PizzaPlace> getPizzaPlaceList() {
        return pizzaPlaceList;
    }

    public void setPizzaPlaceList(List<PizzaPlace> pizzaPlaceList) {
        this.pizzaPlaceList = pizzaPlaceList;
    }
}
