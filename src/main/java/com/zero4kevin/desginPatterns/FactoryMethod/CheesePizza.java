package com.zero4kevin.desginPatterns.FactoryMethod;

/**
 * Created by xi1zhang on 2017/6/23.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }

    public void prepare(){
        System.out.println("Preparing "+name);
        dough=ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
        cheese=ingredientFactory.createCheese();
    }

}
