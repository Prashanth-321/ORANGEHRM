package practise;

public class Stringfunctions {

	public static void main(String[] args) {
		
		String str1;
		String str2;
		
		str1 = "aryan";
		str2 = "sanket";
		
		boolean value = str2.equals(str1);
		
		System.out.println(value);
		System.out.println(str1.contains("a"));
		System.out.println(str2.equalsIgnoreCase(str1));
		char x = str1.charAt(3);
		
		System.out.println(x);
		System.out.println(str1.charAt(1));

	}

}
