package com.zero4kevin.desginPatterns;

/**
 * Created by xi1zhang on 2017/6/19.
 */
public abstract class Duck {
    FlyBehaviour flyBehaviourr;
    QuackBehaviour quackBehaviour;
    public Duck(){}

    public abstract void display();

    public void performFly(){
        flyBehaviourr.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("All ducks float.");
    }

    public void setFlyBehaviourr(FlyBehaviour behaviourr){
        flyBehaviourr=behaviourr;
    }

    public void setQuackBehaviour(QuackBehaviour quack){
        quackBehaviour=quack;
    }
}
