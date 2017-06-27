package com.zero4kevin.desginPatterns.FactoryMethod;

/**
 * Created by xi1zhang on 2017/6/22.
 */
public class CHIPizzaStore extends PizzaStore {
    Pizza pizza;
    PizzaIngredientFactory ingredientFactory=new ChicagoPizzaIngredientFactory();
    public Pizza createPizza(String type) {
        if (type.toLowerCase().equals("cheese")) {
            pizza=new ChicagoStyleCheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.toLowerCase().equals("clam")) {
            pizza=new ChicagoStyleClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }else {
            pizza=null;
        }
        return pizza;
    }
}
