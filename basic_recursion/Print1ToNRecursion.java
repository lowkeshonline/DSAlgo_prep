import java.util.Scanner;

public class Print1ToNRecursion {

  // Regular Recursion

  public static void print1ToNUsingRecursion(int start, int n) { 
  
  if (start > n) {
        return;
      }
      
      System.out.println(start);
      print1ToNUsingRecursion(++start, n);
  }

  // Recursion Backtracking
  
  public static void print1ToNUsingRecursion(int n) {
    if (n <= 0) {
        return;
    }

    print1ToNUsingRecursion(n-1);
    System.out.println(n);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    print1ToNUsingRecursion(1, n);

    print1ToNUsingRecursion(n);
  }   
}
