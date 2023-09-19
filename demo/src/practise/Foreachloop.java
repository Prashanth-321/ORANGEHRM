package practise;

import java.util.ArrayList;

public class Foreachloop {

	public static void main(String[] args) {
		
		ArrayList<String> carlist = new ArrayList<>();

				carlist.add("BMW");
		        carlist.add("Benz");
		        carlist.add("volvo");
		        
		       for (String Output : carlist) {
		    	   
		    	   System.out.println(Output);
				
			}
	}

}
