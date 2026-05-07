import java.util.Scanner;

public class FactorialOfNum {

    // Factorial of a given number Using Recursion

    public static int printFactorialOfNum (int n) { 
        if (n <= 1) {
            return n;
        }
        return n * printFactorialOfNum(n - 1);
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = printFactorialOfNum(n);

        System.out.println(result);
    }
}
