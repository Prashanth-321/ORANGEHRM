package practise;

import java.util.Iterator;

public class removespecial {

	public static void main(String[] args) {


		String s = "@#%^&PRAsh2222anth)(*TT";

		//char ch[] = s.toCharArray();
	

		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);

			if (ch>='A' && ch<='Z' || ch>='a' && ch<='z'||ch>='1' && ch<='9') {
				System.out.print(ch);

			}
			else
			{
				//System.out.print(ch);
			}

		}

	}

}
