package com.zero4kevin.desginPatterns.CompositePattern;

import java.util.Iterator;

/**
 * Created by xi1zhang on 2017/7/12.
 */
public class NullIterator implements Iterator {
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
