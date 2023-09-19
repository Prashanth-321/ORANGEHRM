package practise;

public class patternprint {

	public static void main(String[] args) {
		int n = 5; // Number of rows

		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j * 2 + " ");
			}
			
			System.out.println();
		}
	}



}


