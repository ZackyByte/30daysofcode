import java.util.Scanner;

public class Solution {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        
        // check divisibility up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number to be tested for primality

            if (isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

        scanner.close();
    }
}
