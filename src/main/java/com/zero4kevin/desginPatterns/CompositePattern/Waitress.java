package com.zero4kevin.desginPatterns.CompositePattern;

import java.util.Iterator;

/**
 * Created by kevin on 7/10/17.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator iterator=allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n------");
        while (iterator.hasNext()){
            MenuComponent component=(MenuComponent)iterator.next();// here is a bug, the iterator.next() cannot return a menu or menuItem object.
            try{
                if(component.isVegetarian())
                    component.print();
            }catch (UnsupportedOperationException e){

            }
        }
    }
}
