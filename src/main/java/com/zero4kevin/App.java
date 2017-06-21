package com.zero4kevin;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SortedSet set=new TreeSet(Arrays.asList("one two three four five six seven eight".split(" ")));
        System.out.println(set);
        Iterator iterator=set.iterator();

        for (int i=0; i<=6; i++){
            if(i==6) System.out.println(iterator.next());
            else iterator.next();
        }

        System.out.println(set.headSet("two"));
        System.out.println(set.tailSet("one"));
    }
}
