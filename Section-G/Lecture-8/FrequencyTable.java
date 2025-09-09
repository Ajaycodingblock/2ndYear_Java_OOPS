public class FrequencyTable {
    public static void main(String[] args) {
        String s = "abababab";  // Input string
        
        int arr[] = new int[26];  // Array to store frequency of each letter (a to z)
        
        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Increment frequency count for character 'a' to 'z' by mapping char to index
            arr[s.charAt(i) - 'a']++;
        }
        
        // Print frequency of each character from 'a' to 'z'
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
