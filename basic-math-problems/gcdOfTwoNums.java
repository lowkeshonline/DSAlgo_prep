public class gcdOfTwoNums {
    public static void main(String[] args) {
        
        int num1 = 9;
        int num2 = 12;

        int brute = findGCDOfTwoNumsBrute(num1, num2);
        int optimal = findGCDOfTwoNumsOptimal(num1, num2);

        System.out.println(optimal);
    }

    //Brute force Approach - Iterate until the min number and store the common factors in GCD
    public static int findGCDOfTwoNumsBrute(int num1, int num2) {
        int GCD = 1;

        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if( (num1 % i == 0 ) && (num2 % i == 0)) {
                GCD = i;
            }
        }

        return GCD;
    }

    //Optimal Approach - Iterate in reverse taking the min of 2 numbers as start
    public static int findGCDOfTwoNumsOptimal(int num1, int num2) {
        int GCD = 1;

        for(int i = Math.min(num1, num2); i > 0; i--) {
            if ( (num1 % i == 0) && (num2 % i == 0)) {
                GCD = i;
                break;
            }
        }

        return GCD;
    }
    
}
