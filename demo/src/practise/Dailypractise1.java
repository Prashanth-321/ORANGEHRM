package practise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dailypractise1 {

	public static void main(String[] args) {

		String s = "jfddfdfdgnjkfkbkjbghhdi";
		
		for (int i = 0; i < s.length(); i++) {
			char currentchar = s.charAt(i);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i)==currentchar) {
					count++;
				}
			}
			if (count>1) {
				System.out.println(currentchar+ " : " +count);
		}
			
			}
		}
		
	

}