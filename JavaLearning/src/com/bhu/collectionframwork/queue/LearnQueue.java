package com.bhu.collectionframwork.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

	 public void Task1(){
	        System.out.println("\nTASK 1: \n");

	        // CREATE STACK OBJECT
	        Queue queue = new LinkedList();

	        // ADD ANY 5 VALUE
	        for (int i = 1; i <=5 ; i++) {
	            queue.add(i);
	        }

	        System.out.println("Initial Queue looks like: " + queue);

	        // REMOVE a VALUE
	        queue.remove();

	        // PRINT STACK
	        System.out.println("\nAfter removing an element, Queue looks like: "+ queue);
	    }
}
