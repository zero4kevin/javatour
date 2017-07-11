package com.zero4kevin.desginPatterns.IteratorPattern;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by xi1zhang on 2017/7/11.
 */
public class CafeMenu implements Menu {
    Hashtable<String, MenuItem> menuItems= new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of soup of the day, whit a side salad", false, 3.69);
    }

    public void addItem(String name,String descritpion, boolean vegetarian, double price){
        MenuItem item=new MenuItem(name, descritpion,vegetarian,price);
        menuItems.put(item.getName(),item);
    }
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
