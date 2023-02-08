import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int intVar = 4;
        double doubleVar = 4.0;
        String myString = "HackerRank "; 
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int i = input.nextInt();
        double d = input.nextDouble();
        /* had trouble capturing string s. I needed to use input.next() instead of input.nextLine() */
        String s = input.next();  
        input.close();
        System.out.println(intVar + i);
        /* Printf method with %f specifier sets 1 decimal place explicitly as per instructions.*/
        System.out.printf("%.1f\n", doubleVar + d);
        System.out.println(myString + s);
    }
}