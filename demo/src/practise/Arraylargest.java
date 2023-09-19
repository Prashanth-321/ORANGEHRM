package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Arraylargest {
	
	public static void main(String[] args) {
		
		int[] numbers= {10,1,2 ,4,4,5,6};
		
			
	Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		
		int max =3;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]>max) {
				max=numbers[i];
			}
		}
		
	System.out.println(max);
		int rev[]=new int[numbers.length];
			
		for (int i = 0; i < numbers.length; i++) {
			
			rev[i]=numbers[numbers.length-1-i];
			
		}System.out.println(Arrays.toString(rev));
	}
	

}
