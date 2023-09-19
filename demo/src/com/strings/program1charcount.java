package com.strings;

public class program1charcount {

	public static void main(String[] args) {
		
		String s = "java is super ddd hfgd";
//		String[] arrs = s.split(" ");
//		System.out.println(arrs.length);
		
		char ch = 'd';
		int count=0;
		
		for (int i = 0; i < s.length();i++) {
			
			if(s.charAt(i)== ch)
				count++;
			
		}
		
		System.out.println(count);
		

	}

}
