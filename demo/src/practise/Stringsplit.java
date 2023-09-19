package practise;

public class Stringsplit {

	public static void main(String[] args) {
		
		String data = "E001#NAVEEN#9000";
		
		String[] x = data.split("#");
		
		String eno = x[0];
		String ename = x[1];
		String esal = x[2];
		
		System.out.println(eno);
		System.out.println(ename);
		System.out.println(esal);

	}

}