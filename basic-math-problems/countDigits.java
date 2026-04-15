// Count all digits of a number
import java.util.*;


public class countDigits {

    public static void main(String[] args) {
        int number = 211231823;
        int digitCount = countAllDigits(number);

        System.out.println(digitCount);
    }


    public static int countAllDigits(int n) {

        int count = 0;
        //Initiate the loop to count
        // Loop until the n becomes 0
        while (n > 0) { 
            n = n / 10;
            count++;
        }

        return count;
    }
}