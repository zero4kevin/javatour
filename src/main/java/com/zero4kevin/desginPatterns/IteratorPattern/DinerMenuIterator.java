package com.zero4kevin.desginPatterns.IteratorPattern;

/**
 * Created by kevin on 7/10/17.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position =0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        if(position>=items.length || items[position]==null){
            return false;
        }else {
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem=items[position];
        position +=1;
        return menuItem;
    }
}
