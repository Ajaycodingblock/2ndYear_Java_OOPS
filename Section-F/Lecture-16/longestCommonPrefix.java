import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }

        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];
        int minLength = Math.min(first.length(), last.length());

        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] arr = {"code", "coding", "codingblock", "codeme", "codeit"};

        String prefix = longestCommonPrefix(arr);

        System.out.println("Longest common prefix: " + prefix);
    }
}
