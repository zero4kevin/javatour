package com.zero4kevin.desginPatterns.IteratorPattern;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by xi1zhang on 2017/7/11.
 */
public class AlternatingDinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        position=Calendar.getInstance().DAY_OF_WEEK % 2;
    }

    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }
    }

    public Object next() {
        MenuItem item=items[position];
        position+=2;
        return item;
    }

    public void remove() {
        throw new UnsupportedOperationException("Alternjating Diner Menu Iterator does not support remove()");
    }
}
