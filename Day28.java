import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Move to the next line

        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] row = scanner.nextLine().split(" ");
            String firstName = row[0];
            String email = row[1];

            if (email.endsWith("@gmail.com")) {
                names.add(firstName);
            }
        }

        scanner.close();

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
