package practise;

public class Duplicatecount {
	
	public static void main(String[] args) {
		
//		String name = "bbbbfhfktht gr gsgidbfojghg";
//		
//		
//	     char chars[]= 	name.toCharArray();
//	     
//	     for (int i = 0; i < chars.length; i++) {
//	    	 
//	    	 int count =1;
//			for (int j = i+1; j < chars.length; j++) {
//				
//				if (chars[i]==chars[j]) 
//				{
//					count++;
//					chars[j]='*';
//					
//				}
//				
//				}
//			if(count>0 && chars[i]!='*') {
//				
//				System.out.println(chars[i]+ "count is :"+count);
//			}
//		}
//	     
//		
//	}
//
//}
		
		String s = "ffiifihgi hhihhgsjigjj";
		char ch[] =s.toCharArray();

		for(int i=0;i<ch.length;i++){
			int count = 1;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){

					count++;
					ch[j]='*';

				}

			}
			if(count>0&&ch[i]!='*'&&ch[i]!=' '){

				System.out.println(ch[i]+ " count is " +count);

			}



		}}}
						
				


				
