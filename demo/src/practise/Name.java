package practise;

import java.util.Iterator;

public class Name {

	public static void main(String[] args) {

		String s = "ffhorrrfjhggkdkdbgb";

		char ch[] = s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
			int count =1;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					  ch[j]='*';
				}
			}
			if(count>1 &&ch[i]!='*') {
				
				System.out.println(ch[i]+" = "+ count);
			}
		}
			
		
		
			
		
	}
}
