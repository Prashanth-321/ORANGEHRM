package practise;

public class DuplicateCharacterCounter {
    public static void main(String[] args) {
        String input = "Prashanth";
        printDuplicateCharacters(input);
    }

    public static void printDuplicateCharacters(String str) {
        System.out.println("Duplicate characters and their counts:");
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;
            
            for (int j = 0; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    count++;
                }
            }
            
            if (count > 1) {
                System.out.println(currentChar + ": " + count);
            }
        }
    }
}

