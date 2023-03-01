import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] arr) //constructor takes array of integers
    {
        this.elements=arr;       // array saved as instance variable
    }
    public void computeDifference() // method will find absolute difference between any 2 numbers.
    {       
        for (int i=0;i<elements.length-1;++i) // this bubble sort algorithm will compare elements
        {                                     // in the array and swap if necessary for ascending order
            for(int j=0;j<elements.length-i-1; ++j) 
            {
                if(elements[j+1]<elements[j])
                {
                    int swap = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = swap;
                }                               //Math.abs will find the absolute difference
            }                  // arrays are 0 based which means index 0 is the first element
        }                      // elements.length returns number of elements - 1 = last element
        maximumDifference=Math.abs(elements[(elements.length-1)] - elements[0]);
    }   /* because our elements were sorted in ascending order, the maximum difference will
    always last element - the first element */
        

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
