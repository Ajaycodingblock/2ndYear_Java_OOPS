public class CountWords {

    public static void main(String[] args) {
        // Input string with extra spaces between words
        String str = "  THis   is   gla  ";
        
        // Remove leading and trailing spaces from the string
        str = str.trim();

        // Initialize word count to 1 assuming the string is not empty
        int count = 1;

        // Loop over the string characters to count words by detecting spaces followed by non-space characters
        for (int i = 0; i < str.length() - 1; i++) {
            // If current character is space and next character is not a space, it means a new word starts
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++; // Increment word count
            }
        }

        // Print the total number of words found in the string
        System.out.println("Number of Words : - " + count);
    }
}
