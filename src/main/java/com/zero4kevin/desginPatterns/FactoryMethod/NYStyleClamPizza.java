package com.zero4kevin.desginPatterns.FactoryMethod;

/**
 * Created by xi1zhang on 2017/6/22.
 */
public class NYStyleClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;
    public NYStyleClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }

    public void prepare() {
        System.out.println("making " + name +"......");
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        ingredientFactory.createCheese();
        ingredientFactory.createVeggies();

    }
}
