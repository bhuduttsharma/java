package com.bhu.java8;

import com.bhu.java8.functionalInterface.Sum;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LearnJava8 {

	public void Lambda(){
        System.out.println("----LAMBDA TASK: \n");

        //in main method use lambda function to give implementation of method
        Sum s = (double a, double b) -> System.out.println(a+b);

        //print sum of 98.2+12.8 using method of functional interface.
        s.add(98.2, 12.8);

    }
	
	public void Optional(){
        System.out.println("\n----OPTIONAL TASK: \n");

        String name = "bhudutt";

        //CREATE A OPTIONAL of string & insert value "bhudutt"
        Optional<String> ifName = Optional.of(name);

        //check if value is present using optional method and print on console.
        if (ifName.isPresent()){
            System.out.println("bhudutt is Present");
        }
        else System.out.println("bhudutt is Absent. Submit Rs5000 fine to Anurag");
    }
	public void Stream(){

        System.out.println("\n----STREAM TASK: \n");

        //CREATE A LINKEDLIST WITH VALUES 1,2,3,4,5
        List<Integer> list = new LinkedList<>();
        for (int i = 5; i >= 1 ; i--) {
            list.add(i);
        }
        System.out.println("Initially list looks like: " + list.toString()+ "\n");

        StreamMap(list);
        StreamFilter(list);
        StreamSorted(list);
        StreamforEach(list);
        StreamflatMap();
    }
    public static void StreamMap(List<Integer> list){
        System.out.println("--MAP(): \n");

        //Use map method of stream and add 1 to each value of linkedlist value and collect values of stream in list using collect(--) method of stream. then print the list.
        List<Integer> finalList = list.stream().map(x -> x + 1).collect(Collectors.toList());
        System.out.println("After adding stream's map() function, list looks like: "+ finalList.toString());

    }
    public static void StreamFilter(List<Integer> list){
        System.out.println("\n--Filter(): \n");

        //FILTER ALL EVEN NUMBERS IN THIS LINKEDLIST AND collect values of stream in list using collect(--) method of stream. then print the list.
        List<Integer> filterList = list.stream().filter(x-> x%2 ==0).collect(Collectors.toList());
        System.out.println("After adding stream's filter() function, list looks like: "+ filterList.toString());
    }
    public static void StreamSorted(List<Integer> list){
        System.out.println("\n--Sorted(): \n");

        //use sorted method of stream and collect values of stream in list using collect(--) method of stream and print list on console.
        List<Integer> SortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("After adding stream's sort() function, list looks like: "+ SortedList.toString());

    }
    public static void StreamforEach(List<Integer> list){
        System.out.println("\n--forEach(): \n");

        //use foreach method to print linkedlist values .
        System.out.println("Using stream's forEach() function, Printing initial List: ");
        list.stream().forEach(x-> System.out.println(x));
    }
    public static void StreamflatMap(){
        System.out.println("\n--flatMap(): \n");

        // create 2d linkedlist
        List<String> bakeryList = new LinkedList();
        bakeryList.add("pasta");
        bakeryList.add("donut");

        List<String> productList = new LinkedList();
        productList.add("tomato");
        productList.add("pepper");

        List<List<String>> grocerylist = new LinkedList<>();
        grocerylist.add(bakeryList);
        grocerylist.add(productList);

        System.out.println("Initially 2D list looks like: \n"+ grocerylist.toString());

        List<String> lst = grocerylist.stream().flatMap(l -> l.stream()).collect(Collectors.toList());

        System.out.println("\nAfter adding stream's flatMap() function, list looks like: \n"+ lst.toString());}
}
