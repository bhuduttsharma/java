package com.bhu.collectionframwork.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	public void task1(){
        System.out.println("\nTASK 1: \n");
        List<Integer> arr = new ArrayList<>();
        for (int i = 5; i > 0; i--) {
            arr.add(i);
        }
        System.out.println( "Initial Array List is: " + arr);

        arr.remove(2);

        System.out.println( "Element '3' is removed. Updated Array List is: " + arr);
    }
	
	public void task2(){
        System.out.println("\nTASK 2: \n");
        List<Integer> arr = new ArrayList<>();
        for (int i = 5; i > 0; i--) {
            arr.add(i);
        }
        System.out.println( "Initial Array List is: " + arr);
        Collections.sort(arr);
        System.out.println( "Sorted Array List is: " + arr);
    }
	 public void task3(){
	        System.out.println("\nTask 3: \n");

	        List<Employee> list = new LinkedList<>();

	        Employee<String, Integer> e1 = new Employee<>("Bhudutt", 24, 28000, "ASE (Accenture)");
	        Employee<String, Integer> e2 = new Employee("Anurag", 23, 75000, "Analyst (Cognizant)");
	        Employee<String, Integer> e3 = new Employee("Kapil", 24, 26000, "Trainee (Mindtree)");
	        Employee<String, Integer> e4 = new Employee("Rahul", 24, 0, "Berozgar");

	        list.add(e1);
	        list.add(e2);
	        list.add(e3);
	        list.add(e4);

	        System.out.println("Names of Employees are:");

	        Iterator<Employee> it = list.iterator();

	        while (it.hasNext()) {
	            Employee emp = it.next();
	            System.out.println(emp.getName());
	        }
	    }
	 
	 public void task4() {
	        System.out.println("\nTask 4: \n");

	        List<Integer> list1 = new LinkedList<>();

	        for (int i = 0; i < 5; i++) {
	            list1.add(i + 1);
	        }

	        Iterator<Integer> integerIterator = list1.iterator();

	        while (integerIterator.hasNext()) {
	            System.out.println(integerIterator.next());
	        }
	    }
}
