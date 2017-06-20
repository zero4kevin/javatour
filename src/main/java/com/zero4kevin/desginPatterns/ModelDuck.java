package com.zero4kevin.desginPatterns;

/**
 * Created by xi1zhang on 2017/6/19.
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehaviourr=new FlyNoWay();
        quackBehaviour=new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
