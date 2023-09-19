package practise;

public class Arraysorting {

	public static void main(String[] args) {

		int[] arr = {2,3,5,6,7,8};
		int largest = arr[0];
		
		
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i]>largest) {
				
				
				largest=arr[i];
		}
			}
		
		System.out.println(largest);
	}

}
