package com.zero4kevin.collection.tour;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by kevin on 6/18/17.
 */
public class Collections {
    public static void main(String[] args){
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("First Item");
        linkedList.add("Second Item");
        System.out.println(linkedList.removeFirst());
        System.out.println("linkedList size is "+ linkedList.size());
        Iterator<String> i=linkedList.iterator();
        System.out.print("The left items are: ");
        while(i.hasNext()){
            System.out.print(i.next()+", ");
        }
        System.out.println();

        Arrays.asList();


    }
}
