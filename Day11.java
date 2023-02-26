import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];        //initialize 2D array
      //  int maxval = 0;                     // highest sum of hourglasses. removed due to negative number test cases
        for(int rows=0; rows < 6; rows++)   //loop rows
        {
            for(int columns=0; columns < 6; columns++) //loop columnc
            {
                arr[rows][columns] = in.nextInt(); //place input array into index values
            }
        }
        in.close();
        List<Integer> hourglasses = new ArrayList<Integer>();// *some cases had negative inputs,sum was never greater than maxval
        
        for (int row = 0; row < 4; row++)     // for loops for getting hourglass sums, has to take the bounds of array into account.
        {                                     //the hourglass pattern requires manipulation of index values for numbers left and right
            for (int col = 0; col < 4; col++) // even though it is 6x6 matrix, we would not be able to access elements at 6 +1 or +2
            {                                 // could cause segmentation faults or pollute variables with unwanted values.
                int first = arr[row][col];    // loops stop at 4 and add to the index values to access those elements
                int second = arr[row][col+1]; 
                int third = arr[row][col+2];
                int middle = arr[row+1][col+1];
                int fourth = arr[row+2][col];
                int fifth = arr[row+2][col+1];
                int sixth = arr[row+2][col+2];
                int sum = first + second + third + middle + fourth + fifth + sixth;
                hourglasses.add(sum);
                
               /* if(sum>maxval)               this worked, until we had negative input test cases. 
                {
                    maxval = sum;              always assigns the highest value to maxval
                }*/
                
            }
        }
        //System.out.println(maxval);
        System.out.println(Collections.max(hourglasses)); //collections.max finds the highest value in our list regardless of signum
    }
}
