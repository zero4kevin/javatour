package com.zero4kevin.desginPatterns.StatePattern;

/**
 * Created by xi1zhang on 2017/7/13.
 */
public class GumballMachine {
    State soldOutState;
    State noQuaterState;
    State hasQaurterState;
    State soldState;

    State state= soldOutState;
    int count=0;

    public GumballMachine(int count) {
        soldOutState = new SoldOutState(this);
        this.count = count;
    }

    public void insertQuater(){
        state.insertQuarter();
    }

    public void ejectQuater(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.tumCrank();
        state.dispense();
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count!=0){
            count-=1;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuaterState() {
        return noQuaterState;
    }

    public State getHasQaurterState() {
        return hasQaurterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }
}
