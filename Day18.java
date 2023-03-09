import java.io.*;
import java.util.*;


public class Solution 
{
    // Two instance variables representing stack and queue
    // Stack = Last In, First Out, the last character pushed onto the stack will be the first checked when popped off. 
   
    Stack<Character> stack = new Stack<>(); 
    
    // Que = First In First Out, will check the first character first.
     LinkedList<Character> queue = new LinkedList<>(); 
    
    void pushCharacter(char ch) // The rest is simply following instructions in the task by finding the matching
    {
        stack.push(ch);        // Pushes character onto stack
    }
    void enqueueCharacter(char ch) 
    {
        queue.add(ch);         // Add character to que
    }
    char popCharacter() 
    {
        return stack.pop();   // Pop character off the stack.
    }
    char dequeueCharacter() 
    {
        return queue.remove(); // Remove from que
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
