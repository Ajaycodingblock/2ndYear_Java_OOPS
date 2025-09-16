public class CountVowels {

    public static void main(String[] args) {
        // Sample input string
        String str = "Hello, welcome to Java programming!";

        // Convert string to lowercase to simplify vowel checking
        str = str.toLowerCase();

        // Initialize vowel count
        int vowelCount = 0;

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++; // Increment vowel count
            }
        }

        // Print the total number of vowels
        System.out.println("Number of vowels: " + vowelCount);
    }
}
