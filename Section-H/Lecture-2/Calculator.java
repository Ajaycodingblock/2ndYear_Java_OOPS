// Program 4: Simple Calculator using switch
public class Calculator {
    public static void main(String[] args) {
        int a = 12, b = 4;
        char operator = '/';

        // Switch case for operations
        switch (operator) {
            case '+': System.out.println("Sum = " + (a + b)); break;
            case '-': System.out.println("Difference = " + (a - b)); break;
            case '*': System.out.println("Product = " + (a * b)); break;
            case '/': System.out.println("Quotient = " + (a / b)); break;
            default: System.out.println("Invalid operator");
        }
    }
}
