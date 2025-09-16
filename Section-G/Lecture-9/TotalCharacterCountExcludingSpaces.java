public class TotalCharacterCountExcludingSpaces {

    public static void main(String[] args) {
        // Sample input string with spaces
        String str = "  THis   is   gla  ";

        // Initialize counter for characters excluding spaces
        int count = 0;

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the character is NOT a space
            if (str.charAt(i) != ' ') {
                count++;  // Increment count for non-space characters
            }
        }

        // Print the total count of characters excluding spaces
        System.out.println("Total number of characters excluding spaces: " + count);
    }
}
