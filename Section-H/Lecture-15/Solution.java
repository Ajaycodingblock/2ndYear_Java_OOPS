public class Solution {
    public static int lengthOfLastWord(String s) {
        int endIndex = s.length() - 1;
        while (endIndex >= 0 && s.charAt(endIndex) == ' ') {
            endIndex--;
        }
        int startIndex = endIndex;
        while (startIndex >= 0 && s.charAt(startIndex) != ' ') {
            startIndex--;
        }
        return endIndex - startIndex;
    }

    public static void main(String[] args) {
        String input = "This is a sample string   ";
        int length = lengthOfLastWord(input);
        System.out.println("Length of last word is: " + length);
    }
}
