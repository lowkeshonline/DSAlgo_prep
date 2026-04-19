// An armstrong number is a number that is equal to sum of it's digits raised to the power of number of digits it has.


public class armstrongNumber {
    public static void main(String[] args) {
        int n = 153;

        boolean result = checkIfArmstrong(n);

        System.out.println(result);

    }

    public static boolean checkIfArmstrong(int n) {

        //Store original number, digits of input and sum of digits raised to power into a variable

        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        // Iterate all the digits of the number and add them to the sum raising to the digits number
        
        while (n > 0) {
            int ld = n % 10;

            sum +=  Math.pow(ld, digits);

            n = n / 10;

        }


        //Check if the sum is equal to the input number
        return (sum == original);
    }
}