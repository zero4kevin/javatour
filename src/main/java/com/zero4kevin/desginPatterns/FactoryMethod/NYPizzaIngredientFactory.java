package com.zero4kevin.desginPatterns.FactoryMethod;

import com.zero4kevin.desginPatterns.FactoryMethod.Ingredients.*;

/**
 * Created by xi1zhang on 2017/6/23.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough(){
        System.out.print("adding ");
        return new ThinCrustDough();
    }

    public Sauce createSauce(){
        System.out.print("adding ");
        return new MarinaraSauce();
    }

    public Cheese createCheese(){
        System.out.println("Adding Reggiano Cheese");
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies(){
        System.out.println("add vegetables ");
        Veggies[] veggies= {new Garlic(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam(){
        return new FreshClams();
    }

}
