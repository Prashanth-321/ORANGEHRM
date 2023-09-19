package com.strings;

public class reversewords {

	public static void main(String[] args) {


		String s = "   jva djd tjhssd gjjdf   ";
		String rev = new String();
		
		 String words[] =  s.split(" ");
		 
		   for (int i = 0; i < words.length; i++) {
			 String word = words[i];
			 
			String revword = "";
			
			for (int j = word.length()-1; j >=0 ; j--) {
				
				revword = revword+ word.charAt(j);
			}
			rev=rev+revword+" ";
		}
		 	System.out.println(rev.trim());
	}

}
