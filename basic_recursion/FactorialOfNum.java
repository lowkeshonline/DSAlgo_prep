import java.util.Scanner;

public class FactorialOfNum {

    // Factorial of a given number Using Recursion

    public static int printFactorialOfNum (int n, int fact) { 
        if (n <= 0) {
            return fact;
        }

        fact = fact * n;
        return printFactorialOfNum(n - 1, fact);
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = 1;

        int result = printFactorialOfNum(n, fact);

        System.out.println(result);
    }
}
