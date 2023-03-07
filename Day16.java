import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String S = bufferedReader.readLine();
        bufferedReader.close(); 

        
        try                          
        {
            int strint = Integer.parseInt(S); 
            System.out.print(strint);
        }
        catch(Exception e)                    
        {         
            System.out.print("Bad String");
        }
    }         
}
