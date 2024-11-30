//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;
class Driverclass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String st = sc.next();

            char ans = new Solution().nonRepeatingChar(st);

            if(ans != '$')
                System.out.println(ans);
            else
                System.out.println(-1);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution{
    // Function to find the first non-repeating character in a string.
    static char nonRepeatingChar(String s) {
        // Your code here
        Map<Character, Integer> m = new HashMap<>();
        
        for(Character c : s.toCharArray()) m.put(c, m.getOrDefault(c, 0)+1);
        
        for(Character c : s.toCharArray()){
            if(m.get(c) == 1) return c;
        }
        
        return '$';
    }
}