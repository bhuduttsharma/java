package com.bhu.collectionframwork.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public void Task1(){

        System.out.println("\nTASK 1:");

        //Create a hashmap
        Map<Integer, String> student = new HashMap<>();
        //Add 5 students
        student.put(1, "Bhu Dutt");
        student.put(2, "Anurag");
        student.put(3, "Kapil");
        student.put(4, "Rahul");
        student.put(5, "Ganga");

        //print map on console
        Iterator it1 = student.entrySet().iterator();
        System.out.println("\nInitial HashMap's element: \n");
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        //Remove any one student and again print on console
        student.remove(5);

        System.out.println("\nHashMap after removing the element:");
        Iterator it2 = student.entrySet().iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        //get all keys of map and print on console
        System.out.println("\nGet All Keys: \n"+student.keySet());

        //get all values of map and print on console
        System.out.println("\nGet All Values: \n"+student.values());

        //replace first student name to different name and print on console
        student.replace(1,"Pandey");
        System.out.println("\nFirst Student Replaced with: \n"+student.get(1));
    }
	 public void Task2(){

	        System.out.println("\nTASK 2: \n");

	        //Create LINKEDHASHMAP
	        LinkedHashMap<Integer, String> student = new LinkedHashMap<>();

	        //Add 5 students
	        student.put(1, "Bhu Dutt");
	        student.put(2, "Anurag");
	        student.put(3, "Kapil");
	        student.put(4, "Rahul");
	        student.put(5, "Ganga");
	        //print map on console
	        Iterator it = student.entrySet().iterator();
	        while (it.hasNext()){
	            System.out.println(it.next());
	        }
	    }
	 public void Task3(){
	        System.out.println("\nTASK 3: \n");

	        //Create a treemap of student id as key and name as value
	        Map<Integer,String> tree = new TreeMap<>();

	        tree.put(1, "Bhu Dutt");
	        tree.put(2, "Anurag");
	        tree.put(3, "Kapil");
	        tree.put(4, "Rahul");
	        tree.put(5, "Ganga");

	        System.out.println("Original order of the objects added to treeMap is: \n" + "5: Ganga \n4: Rahul \n3: Kapil \n2: Anurag \n1: Bhudutt");

	        System.out.println("\nBut in TreeMap, the order of object looks like:");


	        Iterator key = tree.keySet().iterator();
	        Iterator value = tree.values().iterator();

	        while (key.hasNext()){
	            System.out.println(key.next() + ": " + value.next());
	        }

	    }
}
