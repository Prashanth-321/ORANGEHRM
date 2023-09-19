package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;

public class Arraypractise {
	
	
	public static void main(String[] args) {
		
		int[] array1 = {1,3,7,6,3,7,4,};
		String[] array = {"element1", "element2", "element3"};
		
		Set<Integer> list = new HashSet<>();
				
		for (int b : array1) {
			list.add(b);
		}
		System.out.println(list);
		
		List<String> list1 = Arrays.asList(array); 
		
		for (String string : list1) {
			
			System.out.println(string);
		}
		
	}
	
}
