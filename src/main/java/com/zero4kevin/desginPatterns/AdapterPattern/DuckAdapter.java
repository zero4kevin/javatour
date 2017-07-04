package com.zero4kevin.desginPatterns.AdapterPattern;

/**
 * Created by xi1zhang on 2017/7/4.
 */
public class DuckAdapter implements Turkey {
    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        duck.fly();
    }
}
