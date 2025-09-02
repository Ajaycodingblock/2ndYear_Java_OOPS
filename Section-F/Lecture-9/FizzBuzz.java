// Program 15: FizzBuzz (classic problem)
public class FizzBuzz {
    public static void main(String[] args) {
        int arr[] = {5,3,10,15,20};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (arr[i] % 3 == 0) {
                System.out.println("Fizz");
            } else if (arr[i] % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
