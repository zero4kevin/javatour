package com.zero4kevin.desginPatterns.IteratorPattern;

import java.util.Iterator;
/**
 * Created by kevin on 7/10/17.
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        Iterator pancakeMenuIterator= pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator= dinerMenu.createIterator();
        System.out.println("Menu-----breakfast");
        printMenu(pancakeMenuIterator);
        System.out.println("Menu-----launch");
        printMenu(dinerMenuIterator);
        System.out.println("Menu-----dinner");
        printMenu(cafeMenu.createIterator());
    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()){
            MenuItem menuItem=(MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " "+ menuItem.getPrice()+ " " + menuItem.getDescription());
        }
    }
}
