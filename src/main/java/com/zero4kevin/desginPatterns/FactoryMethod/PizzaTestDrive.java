package com.zero4kevin.desginPatterns.FactoryMethod;

/**
 * Created by xi1zhang on 2017/6/22.
 */
public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore=new NYPizzaStore();
        nyStore.orderPizza("cheese");
        PizzaStore chStore=new CHIPizzaStore();
        chStore.orderPizza("clam");
    }
}
