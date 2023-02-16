import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> list = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        bufferedReader.close();
        
        //It seems the list can be reversed with a single method, so thats a little bit too easy.
        //I'll convert it to an array and use an algorithm instead.
        
        int[] arr = list.stream().mapToInt(i->i).toArray();
        
        for(int i = 0; i < arr.length / 2; i++)
        {                                     // first iteration of loop would:
            int temp = arr[i];                // temporarily store the first element in temp
            arr[i] = arr[arr.length - i - 1]; // assign the first element the as the last element
            arr[arr.length - i - 1] = temp;   // assign the last element the value in temp  
        }
        for(int i=0;i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }   
}
