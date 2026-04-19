import java.util.ArrayList;
import java.util.Comparator;

public class printDivisors {
    public static void main(String[] args) {
        int num = 36;

        ArrayList<Integer> result = printAllDivisors(num);

        // Reorder the output to ascending
        result.sort(Comparator.naturalOrder());

        for (int n : result) {
            System.out.println(n);
        }
    }

    public static ArrayList<Integer> printAllDivisors(int num) {

        ArrayList<Integer> divisors = new ArrayList<>();
        
        //Iterate till the square of the number
        for(int i = 1; i * i <= num; i++) {
            if ( num % i == 0) {
                //Add those which were completely divided by the n to array
                divisors.add(i);

                //Ignore if the divisor is same as factor
                if(i != num / i) {
                    divisors.add(num / i);
                }
            }
        }

        return divisors;
    }
}
