package com.zero4kevin.desginPatterns.AdapterPattern;

/**
 * Created by xi1zhang on 2017/7/4.
 */
public class TurkeyAdapter implements Duck  {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for(int i=0;i<5;i++)
            turkey.fly();
    }
}
