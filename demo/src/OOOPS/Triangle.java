package OOOPS;

import java.util.Iterator;

public class Triangle {

	public static void main(String[] args) {
		int row =5;
		for (int i = 1; i <= row; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				for (int k = 1; k <= j; k++) {
					
				
				System.out.print("*");
				}
			}
			System.out.println();
		}

		

	}

}
