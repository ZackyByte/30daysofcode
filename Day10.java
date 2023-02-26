import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
            
        ArrayList<Integer> bintegers = new ArrayList<Integer>(); // int Array wasnt useful as it needs size allocated
        Iterator<Integer> itr = null;                           // List is better when size is unknown
                                                 
        int max = 0;                                          // the list is mostly practice
        int sum = 0;                                          // could just increment sum everytime n modulo 2 is 1   
        
        do{
            int remainder = n%2;                            // to reduce to binary, we need to divide by 2
            bintegers.add(remainder);                       // keep the remainder
            n = n/2;
        }while(n != 0);
                                                 // stop when n == 0     
        itr = bintegers.listIterator();         // list iterator will allow list elements to be checked
        while(itr.hasNext())                    // while there are values in our list iterator
        {
            if(itr.next() == 1)                // if we have 1
            {
                sum++;                        // increment sum
                if(sum>max)
                {
                    max=sum;                  // the maximum number of times 1 appears consecutively
                }
            }
            else 
            {
                sum=0;                       // if we find 0 sum resets to 0
            }
        }
        System.out.println(max);            
    }
}

