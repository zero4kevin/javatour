package com.zero4kevin.desginPatterns.FactoryMethod;

/**
 * Created by xi1zhang on 2017/6/23.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory=ingredientFactory;
    }

    public void prepare(){
        System.out.println("Preparing "+name);
        dough=ingredientFactory.createDough();
        sauce=ingredientFactory.createSauce();
        cheese=ingredientFactory.createCheese();
        clam=ingredientFactory.createClam();
    }

}
