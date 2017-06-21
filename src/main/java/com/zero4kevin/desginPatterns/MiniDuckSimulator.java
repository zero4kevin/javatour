package com.zero4kevin.desginPatterns;

/**
 * Created by xi1zhang on 2017/6/19.
 */
public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard=new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        mallard.swim();

        Duck model=new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehaviourr(new FlyRockPowered());
        model.performFly();
    }
}
