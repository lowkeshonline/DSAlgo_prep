import java.util.Scanner;

public class SumOfFirstN {
    // Print Sum of First N Numbers
    public static int printSumOfFirstN(int n, int sum) { 

        if ( n <= 0) {
            return sum;
        }

        sum = sum + n;

        return printSumOfFirstN(n - 1, sum);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;

        int result = printSumOfFirstN(n, sum);

        System.out.println(result);
    }
}
