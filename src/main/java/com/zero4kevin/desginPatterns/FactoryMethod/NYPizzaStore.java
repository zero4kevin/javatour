package com.zero4kevin.desginPatterns.FactoryMethod;

/**
 * Created by xi1zhang on 2017/6/22.
 */
public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item){
        Pizza pizza=null;
        PizzaIngredientFactory ingredientFactory=new NYPizzaIngredientFactory()
        if(item.equals("cheese")){
            pizza=new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if(item.equals("veggie")){
            return new NYStyleClamPizza();
        }else{
            return null;
        }
    }
}
