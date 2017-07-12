package com.zero4kevin.desginPatterns.CompositePattern;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by xi1zhang on 2017/7/12.
 */
public class CompositeIterator implements Iterator {
    Stack stack= new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    public boolean hasNext() {
        if (stack.empty()){
            return false;
        }else {
            Iterator iterator=(Iterator) stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    public Object next() {
        if(hasNext()){
            Iterator iterator=(Iterator) stack.peek();
            MenuComponent component=(MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(((Menu) component).createIterator());
            }
            return component;
        }else{
            return null;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
