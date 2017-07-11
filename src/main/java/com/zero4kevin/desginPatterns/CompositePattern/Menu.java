package com.zero4kevin.desginPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by xi1zhang on 2017/7/11.
 */
public class Menu extends MenuComponent {
    String name;
    String description;
    ArrayList menuComponent=new ArrayList();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponent.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponent.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponent.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
    }
}
