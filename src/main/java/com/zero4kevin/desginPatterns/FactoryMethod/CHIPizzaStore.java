package com.zero4kevin.desginPatterns.FactoryMethod;

/**
 * Created by xi1zhang on 2017/6/22.
 */
public class CHIPizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        if(type.toLowerCase().equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(type.toLowerCase().equals("clam")){
            return new CHIStyleClamPizza();
        }else{
            return null;
        }
    }
}
