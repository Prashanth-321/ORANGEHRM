
package Collections;

import java.util.*;

public class vpractise {
	
	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector();
		v1.add("ddssd");
		v1.add("dhf");
		v1.add("Raj");
		v1.add(1, "arja");
		v1.add("ss");
		v1.add("s");
		
		Vector<String> v2 = new Vector();
		
		v2.add("hekko");
		v2.add("okdle");
		v2.add("djfbf");
		v2.add(1, "ddd");
		v2.add("oiehf");
		v2.add("ffjr");
		
		v1.addAll(v2);
		
		System.out.println(v1);
		System.out.println(v1.get(3));
		v1.remove(7);
		System.out.println(v1);
		System.out.println(v1.contains("okdle"));
		v1.set(4, "rajesh");
		System.out.println(v1.containsAll(v2));
		
		Object[] arr = new Object[] {1,2,3,4,5};
		Vector<Object> v3= new Vector<Object>(Arrays.asList(arr));
		
		
	
	}

}
