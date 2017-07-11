package com.zero4kevin.desginPatterns.IteratorPattern;

import java.util.ArrayList;

/**
 * Created by kevin on 7/10/17.
 */
public class MenuTestDrive {
    public static void main (String[] args){
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        CafeMenu cafeMenu=new CafeMenu();
        ArrayList<Menu> list=new ArrayList<Menu>();
        list.add(pancakeHouseMenu);
        list.add(dinerMenu);
        list.add(cafeMenu);
        Waitress waitress=new Waitress(list);
        waitress.printMenu();
    }
}
