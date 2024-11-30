
//{ Driver Code Starts 
import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.stream.*;

class GFG {
    public static void main(String[] args) throws IOException { 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            Solution obj = new Solution();

            if(obj.areAnagram(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Solution{
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagram(String s1, String s2){
        // Your code here
        if(s1.length() != s2.length()) return false;
        
        Map<Character, Integer> m = new HashMap<>();
        
        for(Character c : s1.toCharArray()) m.put(c, m.getOrDefault(c, 0)+1);
        
        for(Character c : s2.toCharArray()){
            
            if(m.containsKey(c) && m.get(c)>0) m.put(c, m.get(c)-1);
            else return false;
        }
        
        return true;
    }
}