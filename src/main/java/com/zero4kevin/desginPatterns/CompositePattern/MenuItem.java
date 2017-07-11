package com.zero4kevin.desginPatterns.CompositePattern;

/**
 * Created by xi1zhang on 2017/7/10.
 */
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

}
