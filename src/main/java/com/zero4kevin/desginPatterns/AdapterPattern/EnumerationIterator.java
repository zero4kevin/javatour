package com.zero4kevin.desginPatterns.AdapterPattern;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by xi1zhang on 2017/7/5.
 */
public class EnumerationIterator implements Iterator {
    private Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration=enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
