package com.zero4kevin.desginPatterns.IteratorPattern;

/**
 * Created by kevin on 7/10/17.
 */
public class MenuTestDrive {
    public static void main (String[] args){
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu();
    }
}
