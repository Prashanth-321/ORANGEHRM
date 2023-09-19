package practise;

public class Switchcase {

	public static void main(String[] args) {
		
		String course = "s";
		
		switch (course.toLowerCase()) {
		
		case "s":
			System.out.println("selenim");
			break;
			
		case "q":
            System.out.println("QTP");

		default:
			
		System.out.println("invalid course");
			
		}

	}

}
