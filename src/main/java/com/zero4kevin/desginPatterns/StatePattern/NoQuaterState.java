package com.zero4kevin.desginPatterns.StatePattern;

/**
 * Created by xi1zhang on 2017/7/13.
 */
public class NoQuaterState implements State {
    GumballMachine gumballMachine;

    public NoQuaterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQaurterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void tumCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }
}
