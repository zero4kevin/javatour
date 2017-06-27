package com.zero4kevin.desginPatterns.FactoryMethod;

import com.zero4kevin.desginPatterns.FactoryMethod.Ingredients.*;

/**
 * Created by xi1zhang on 2017/6/26.
 */
public class CAPizzaIngredientFactory implements PizzaIngredientFactory {
    public Clams createClam(){ return new Camari();}

    public Dough createDough(){ return new VeryThinkCrust();}

    public Cheese createCheese(){ return new GoatCheese();}

    public Sauce createSauce(){ return new BrushchettaSauce();}

    public Pepperoni createPepperoni(){ return new Pepperoni();}

    public Veggies[] createVeggies(){
        Veggies[] veggies= {new Garlic(), new Mushroom()};
        return veggies;
    }
}
