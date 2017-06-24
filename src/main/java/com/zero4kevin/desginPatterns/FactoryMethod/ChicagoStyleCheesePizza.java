package com.zero4kevin.desginPatterns.FactoryMethod;

/**
 * Created by xi1zhang on 2017/6/22.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name="Chicago Style Deep Dish Cheese Pizza";
        sauce="Plum Tomato Sauce";
        dough="Extra Thick Crust Dough";

        toppings.add("Shredded Mazzarella Cheese");
    }
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
