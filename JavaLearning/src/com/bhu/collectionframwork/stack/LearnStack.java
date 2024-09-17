package com.bhu.collectionframwork.stack;

import java.util.Stack;

public class LearnStack {

	 public void Task1(){
	        System.out.println("\nTASK 1: \n");

	        // CREATE STACK OBJECT
	        Stack stack = new Stack<>();

	        // ADD ANY 5 VALUE
	        for (int i = 1; i <=5 ; i++) {
	            stack.push(i);
	        }

	        System.out.println("Initial Stack looks like: " + stack);

	        // REMOVE a VALUE
	        stack.pop();

	        // PRINT STACK
	        System.out.println("\nAfter removing an element, Stack looks like: "+ stack);

	    }
}
