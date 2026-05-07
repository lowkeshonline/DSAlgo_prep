public class primeNumber {
    
    public static void main(String[] args) {
        
        int number = 29;

        boolean result = checkPrimeNumber(number);

        System.out.println(result);
    }

    public static boolean checkPrimeNumber(int n) {

        for(int i = 2; i * i <= n; i++) {
            if ( n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
