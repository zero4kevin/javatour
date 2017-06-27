package com.zero4kevin.desginPatterns.FactoryMethod;

import com.zero4kevin.desginPatterns.FactoryMethod.Ingredients.*;

/**
 * Created by xi1zhang on 2017/6/26.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough(){ return new ThickCrustDough(); }

    public Sauce createSauce(){ return new PlumTomatoSauce(); }

    public Cheese createCheese(){ return new MozzarellaCheese(); }

    public Clams createClam() { return new FrozenClams();}

    public Veggies[] createVeggies(){
        Veggies[] veggies={new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

}
