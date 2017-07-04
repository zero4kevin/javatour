package com.zero4kevin.desginPatterns.AdapterPattern;

/**
 * Created by xi1zhang on 2017/7/4.
 */
public class DuckTestDrive {
    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    public static void main(String[] args){
        MallardDuck mallardDuck=new MallardDuck();
        WildTurkey turkey=new WildTurkey();
        TurkeyAdapter fakeDuck=new TurkeyAdapter(turkey);
        turkey.gobble();
        turkey.fly();
        testDuck(fakeDuck);

    }
}
