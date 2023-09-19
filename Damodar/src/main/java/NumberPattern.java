
public class NumberPattern {
    public static void main(String[] args) {
        int start = 10;
        
        while (start >= 2) {
            for (int i = start; i >= 2; i -= 2) {
                System.out.print(i + " ");
            }
            
            System.out.println();
            start -= 2;
        }
    }
}

