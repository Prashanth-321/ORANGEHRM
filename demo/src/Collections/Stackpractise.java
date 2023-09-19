package Collections;

import java.util.Stack;

public class Stackpractise {
	
	public static void main(String[] args) {
		
		Stack<Integer> st1 = new Stack();
		Stack<String> st2 = new Stack();
		st2.add("dddd");
		st2.add("dhfhf");
		st2.add("sde");
		st2.add("1waad");
		st2.add("ogd");
		st2.add("ofgrj");
		
		st2.set(3, "ffbjkg");
		st2.contains("sde");
		
		
		System.out.println(st2.peek()); // show last element
		System.out.println(st2.push("hello")); // add the element
		System.out.println(st2.pop()); // remove last element
		System.out.println(st2.search("ogd")); // search from top to bottom and returns the index of it
		
		System.out.println(st2.size());
		System.out.println(st2.capacity());
		
		
		
		
	}

}
