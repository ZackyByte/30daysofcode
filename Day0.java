import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in).useDelimiter("\n"); // Delimiter for input spaces.
        String inputString = scanner.next(); // Input for Welcome to ...
        scanner.close();
        System.out.println("Hello, World.");
        System.out.println(inputString);  
    }
}