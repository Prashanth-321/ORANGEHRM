package practise;

import javax.naming.spi.DirStateFactory.Result;

public class Reverse {

	public static void main(String[] args) {
		String result ="" ;
		String  name = "Prashanth";
		char reverse[]= name.toCharArray();

		for (int i = reverse.length-1; i >=0; i--) 
		{
			 //result = result + reverse[i];
			System.out.print(reverse[i]);
			
			}
		//System.out.println(result);
	}
	
}
