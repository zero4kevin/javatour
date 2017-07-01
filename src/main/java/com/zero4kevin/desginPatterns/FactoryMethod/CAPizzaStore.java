package com.zero4kevin.desginPatterns.FactoryMethod;

/**
 * Created by kevin on 6/24/17.
 */
public class CAPizzaStore extends PizzaStore {
    Pizza pizza=null;
    public Pizza createPizza(String type){
        if(type.toLowerCase().equals("cheese")){
            pizza=new CAStyleCheesePizza();
            pizza.setName("California Style Cheese Pizza");
        }
        return pizza;
    }

}
