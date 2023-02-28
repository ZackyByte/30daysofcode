import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0;i < num; i++)
        {
            String s= scanner.nextLine();
            char[] arr = s.toCharArray();
            for(int j = 0; j < arr.length; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(arr[j]);
                }
            }
            System.out.print(" ");
            for (int j = 0; j< arr.length; j++)
            {
                if(j % 2 == 1)
                {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
