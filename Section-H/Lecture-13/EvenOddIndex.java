public class EvenOddIndex {
    public static void main(String[] args) {
        String str = "hello";  // Input string

        System.out.print("Characters at even indices: ");
        // Loop to print characters at even indices (0, 2, 4, ...)
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(str.charAt(i) + " ");
            }
        }

        System.out.println(); // New line

        System.out.print("Characters at odd indices: ");
        // Loop to print characters at odd indices (1, 3, 5, ...)
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}
