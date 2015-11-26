package com.example.alienware.projectpizza.Objects;

/**
 * Created by user on 26/11/2015.
 */
public class Drink {

    String name;
    int size;
    String image;

    public Drink(String name, int size, String image) {
        this.name = name;
        this.size = size;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
