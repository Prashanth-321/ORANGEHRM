package OOOPS;

public class Reversenum {

	public static void main(String[] args) {
//
//		int number = 1234321;
//		int reverse = 0;
//		int temp=number;
//		
//		for (;number!=0;number=number/10) {
//			int reminder=number%10;
//			reverse=reverse*10+reminder;
//			
//			
//		}
//		System.out.println(reverse);
//		if (reverse==temp) {
//			
//			System.out.println("palindrome");
//			
//			
//		}else 
//		{
//			System.out.println("not palindrome");
//		}
//
		int number = 123454321;
		int reverse = 0;
		int temp=number;
		
		while (number!=0) {
			
			int reminder =number%10;
			number = number/10;
			
			reverse = reverse*10 +reminder;
			
			
			
		}
		System.out.println(reverse);
		if (temp==reverse) {
			System.out.println("is palindrome");
		}else 
		{
			System.out.println("is not palindrome");
			
		}
	}
	
}
