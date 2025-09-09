class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";  // Input string to check
        String rev = "";       // Variable to store the reversed string

        // Loop through the string from the end to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);  // Append each character in reverse order
        }

        // Compare the original string with the reversed string
        if (str.equals(rev))
            System.out.println("Palindrome");  // If equal, it is a palindrome
        else
            System.out.println("Not Palindrome");  // Otherwise, not a palindrome
    }
}
