import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str = "";
        String fw = strs[0];
        String lw = strs[strs.length - 1];
        int len = Math.min(fw.length(), lw.length());

        for (int i = 0; i < len; i++) {
            if (fw.charAt(i) != lw.charAt(i)) {
                break;
            }
            str = str + fw.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] input = {"flower", "flow", "flight"};
        String prefix = sol.longestCommonPrefix(input);
        System.out.println("Longest Common Prefix: " + prefix);
    }
}
