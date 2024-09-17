package com.bhu.collectionframwork.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	
	public void Task1(){
        System.out.println("\nTASK 1: \n");

//        CREATE OBJECT OF LINKEDHASHSET and add 1,2,3,4,5
        Set linkedSet = new LinkedHashSet();
        for (int i = 1; i <= 5 ; i++) {
            linkedSet.add(i);
        }

        System.out.println("Initial LINKEDHASHSET looks like: \n" + linkedSet);

        //Remove
        linkedSet.remove(3);

        //Print SET
        System.out.println("\nAfter removing '3' LINKEDHASHSET looks like: \n" + linkedSet);
    }

	public void Task2(){
        System.out.println("\nTASK 2: \n");

        Set treeSet = new TreeSet<>();

        for (int i = 5; i >= 1 ; i--) {
            treeSet.add(i);
        }

        System.out.println("Original order of the objects added to TreeSet is: [5, 4, 3, 2, 1]");

        System.out.println("\nBut in TreeSet, the order of object looks like: " + treeSet);
    }
}
