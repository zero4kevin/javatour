package com.zero4kevin.desginPatterns.FactoryMethod;

import com.zero4kevin.desginPatterns.FactoryMethod.Ingredients.*;

/**
 * Created by xi1zhang on 2017/6/23.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
