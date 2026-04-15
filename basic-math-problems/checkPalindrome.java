public class checkPalindrome {
    public static void main(String[] args) {
        int number = -121;

        boolean isPalindrome = checkIfNumberIsPalindrome(number);

        System.out.println(isPalindrome);
    }

    public static boolean checkIfNumberIsPalindrome(int n) {
        int original = n;

        int reversed = 0;

        while (n != 0) {
            int lastDigit = n % 10;

            reversed = (reversed * 10)+ lastDigit;

            n = n / 10;
        }

        // Negative numbers cannot be palindromes since -121 != 121-
        return (original == reversed && original > 0) ? true : false;
    }
}
