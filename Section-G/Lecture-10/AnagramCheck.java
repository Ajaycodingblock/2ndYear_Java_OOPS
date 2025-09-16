public class AnagramCheck {

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    // Single function to check if two strings are anagrams considering only alphabets
    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        int length1 = 0;
        int length2 = 0;

        // Count frequency of alphabets in s1 and calculate effective length (alphabets only)
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq1[ch - 'a']++;
                length1++;
            }
        }

        // Count frequency of alphabets in s2 and calculate effective length
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq2[ch - 'a']++;
                length2++;
            }
        }

        // If count of alphabets differ, not an anagram
        if (length1 != length2) {
            return false;
        }

        // Compare frequency tables
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}
