package com.zero4kevin.desginPatterns.StatePattern;

/**
 * Created by xi1zhang on 2017/7/13.
 */
public class WinnerState implements  State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {

    }

    public void ejectQuarter() {

    }

    public void tumCrank() {

    }

    public void dispense() {

    }
}
