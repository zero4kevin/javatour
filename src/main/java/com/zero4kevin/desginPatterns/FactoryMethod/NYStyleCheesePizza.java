package com.zero4kevin.desginPatterns.FactoryMethod;

import com.zero4kevin.desginPatterns.FactoryMethod.Ingredients.*;

/**
 * Created by xi1zhang on 2017/6/22.
 */
public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        ingredientFactory=pizzaIngredientFactory;
    }

    public void prepare(){
        System.out.println("preparing "+ name + ".......");
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        ingredientFactory.createCheese();
        ingredientFactory.createVeggies();
    }

}