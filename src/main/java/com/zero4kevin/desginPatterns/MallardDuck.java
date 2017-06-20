package com.zero4kevin.desginPatterns;

/**
 * Created by xi1zhang on 2017/6/19.
 */
public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehaviour=new Quack();
        flyBehaviourr=new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a mallard duck.");
    }
}
