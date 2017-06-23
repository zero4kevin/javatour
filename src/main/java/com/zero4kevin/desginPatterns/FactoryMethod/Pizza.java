package com.zero4kevin.desginPatterns.FactoryMethod;

import com.zero4kevin.desginPatterns.FactoryMethod.Ingredients.*;

import java.util.ArrayList;

/**
 * Created by xi1zhang on 2017/6/22.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggiesArray;
    Cheese cheese;
    Clams clam;
    ArrayList toppings = new ArrayList();

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 mintues at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){this.name=name;}

    public String toString(){ return name;}
}
