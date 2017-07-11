package com.zero4kevin.desginPatterns.CompositePattern;

/**
 * Created by kevin on 7/10/17.
 */
public class MenuTestDrive {
    public static void main (String[] args){
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        CafeMenu cafeMenu=new CafeMenu();
        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu,cafeMenu);
        waitress.printMenu();
    }
}
