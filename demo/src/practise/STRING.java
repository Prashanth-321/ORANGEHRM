package practise;

public class STRING {
	
	public static void main(String[] args) {
		
		String s = "bhanu praksahfbfd hh";
		
		StringBuilder sd = new StringBuilder(s);
		System.out.println(sd.capacity());
		sd.reverse();
		System.out.println(sd.hashCode());
	}
	
	

}
