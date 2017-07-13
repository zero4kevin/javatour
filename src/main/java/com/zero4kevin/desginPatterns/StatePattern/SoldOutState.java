package com.zero4kevin.desginPatterns.StatePattern;

/**
 * Created by xi1zhang on 2017/7/13.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("");
    }

    public void ejectQuarter() {
        System.out.println("");
    }

    public void tumCrank() {

    }

    public void dispense() {

    }
}
