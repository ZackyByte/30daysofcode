import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String []argh)
    {
        Hashtable<String,Integer> my_dict = new Hashtable<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++)
        {
            String name = in.next();
            int phone = in.nextInt();
            my_dict.put(name,phone);
            
        }
        while(in.hasNext())
        {
            String s = in.next();
            if(my_dict.containsKey(s))
            {
                System.out.println(s+"="+my_dict.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
