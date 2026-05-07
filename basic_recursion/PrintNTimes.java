import java.util.Scanner;
public class PrintNTimes {


    // Print Something N times using recursion 
    public static void printNTimes(int n) {

        if (n <= 0) {
            return;
        }

        System.out.println("Hello world");

        printNTimes(n - 1);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNTimes(n);


    }
}
