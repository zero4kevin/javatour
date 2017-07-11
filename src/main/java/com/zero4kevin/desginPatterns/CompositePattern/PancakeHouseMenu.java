package com.zero4kevin.desginPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xi1zhang on 2017/7/10.
 */
public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems =new ArrayList();
        addItem("K&B Pancake Breakfast", "Pancake with scrambled eggs and toast", true,2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false,2.99 );
        addItem("Blueberry Pancake", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true,3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem=new MenuItem(name, description,vegetarian,price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator(){
        return menuItems.iterator();
    }
}