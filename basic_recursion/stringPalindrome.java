import java.util.Scanner;

public class stringPalindrome {

    public static boolean checkIfStringIsPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char left = s.charAt(start);
            char right = s.charAt(end);

            //Check left pointer value is alphanumeric
            if (!Character.isLetterOrDigit(left)) {
                start++;
            //Check right pointer value is alphanumeric
            } else if (!Character.isLetterOrDigit(right)) {
                end--;
            // check if both the left and right alphanumerics aren't same
            } else if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            // If same move pointers to the next char
            } else {
                start++;
                end--;
            }
        }

        //return true if all the chars passes the cases
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        boolean result = checkIfStringIsPalindrome(s);

        System.out.println(result);
    }
}
