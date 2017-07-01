package com.zero4kevin.desginPatterns.FactoryMethod;

import com.zero4kevin.desginPatterns.FactoryMethod.Ingredients.MarinaraSauce;
import com.zero4kevin.desginPatterns.FactoryMethod.Ingredients.Sauce;
import com.zero4kevin.desginPatterns.FactoryMethod.Ingredients.ThickCrustDough;

/**
 * Created by xi1zhang on 2017/6/22.
 */
public class ChicagoStyleClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;
    }

    public void prepare(){
        System.out.println("preparing " + name + "......");
        ingredientFactory.createCheese();
        ingredientFactory.createClam();
        ingredientFactory.createDough();
        ingredientFactory.createPepperoni();
        ingredientFactory.createSauce();
        ingredientFactory.createVeggies();
    }

}
