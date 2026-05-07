import java.util.Scanner;

public class FibonacciNumber {

    // Fibonacci using iteration

    public static int printNthFibonacciUsingIteration(int n) {

        int first = 0;
        int second = 1;
        
        for (int i = 1; i <= n; i++) {
            int newVal = first + second;
            first = second;
            second = newVal;
        }

        return first;
    }

    // Fibonacci using Recursion

    public static int printNthFibonacciUsingRecursion(int n) {

        if(n < 2) {
            return n;
        }

        return printNthFibonacciUsingRecursion(n-1) + printNthFibonacciUsingRecursion(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = printNthFibonacciUsingRecursion(n);
        int result2 = printNthFibonacciUsingIteration(n);

        System.out.println(result);
        System.out.println(result2);
    }
}
