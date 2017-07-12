package com.zero4kevin.desginPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xi1zhang on 2017/7/11.
 */
public class Menu extends MenuComponent {
    public boolean isVegeterian() {
        return false;
    }

    String name;
    String description;
    ArrayList<MenuComponent> menuComponentLists=new ArrayList();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponentLists.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponentLists.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponentLists.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n"+getName());
        System.out.println(", "+getDescription());
        System.out.println("------------------");
        Iterator iterator=menuComponentLists.iterator();
        while(iterator.hasNext()){
            ((MenuComponent) iterator.next()).print();
        }
    }

    public Iterator createIterator(){
        return new CompositeIterator(menuComponentLists.iterator());
    }
}
