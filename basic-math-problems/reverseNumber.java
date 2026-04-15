public class reverseNumber {
    public static void main(String[] args) {
        int number = -2147483642;
        int result = reverseTheNumber(number);

        System.out.println(result);
    }

    public static int reverseTheNumber(int n) {
        
        int reversed = 0;

        while (n != 0) {
            int lastDigit = n % 10;

            // Safety check for the integer overflow while multiplying the reversed with 10

            if(reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reversed = (reversed * 10) + lastDigit;

            n = n / 10;
        }

        return reversed;
    }
}
