package com.zero4kevin.desginPatterns.IteratorPattern;

import java.util.ArrayList;

/**
 * Created by kevin on 7/10/17.
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList list;
    int index =0;

    public PancakeHouseMenuIterator(ArrayList list) {
        this.list = list;
    }

    public boolean hasNext() {
        if(index >=list.size()||list.get(index)==null){
            return false;
        }else {
            return true;
        }
    }

    public Object next() {
        Object object=list.get(index);
        index +=1;
        return object;
    }
}
