import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // maximum integer to consider
            int k = scanner.nextInt(); // limit of the result

            int max = 0;
            for (int a = n; a >= 1; a--) {
                for (int b = a - 1; b >= 1; b--) {
                    int result = a & b;
                    if (result < k && result > max) {
                        max = result;
                    }
                }
            }

            System.out.println(max);
        }

        scanner.close();
    }
}

