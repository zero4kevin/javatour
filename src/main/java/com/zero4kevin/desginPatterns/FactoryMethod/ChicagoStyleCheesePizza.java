package com.zero4kevin.desginPatterns.FactoryMethod;

/**
 * Created by xi1zhang on 2017/6/22.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        ingredientFactory=pizzaIngredientFactory;
    }

    public void prepare(){
        System.out.println("making "+ name);
        ingredientFactory.createDough();
        ingredientFactory.createCheese();
        ingredientFactory.createSauce();
        ingredientFactory.createVeggies();
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }

}
