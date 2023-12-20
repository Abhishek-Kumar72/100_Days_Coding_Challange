/*
Given a string Str which may contains lowercase and uppercase chracters. The task is to remove all duplicate characters from the
string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

Example 1:

Input:
Str = geeksforgeeks
Output: geksfor
Explanation: After removing duplicate
characters such as e, k, g, s, we have
string as "geksfor".
Example 2:

Input:
Str = HappyNewYear
Output: HapyNewYr
Explanation: After removing duplicate
characters such as p, e, a, we have
string as "HapyNewYr".
Your Task:
Complete the function removeDuplicates() which takes a string str, as input parameters and returns a string denoting the answer. You don't
have to print answer or take inputs.
*/
  
  //Code

class Duplicates {
    String removeDuplicates(String str) {
        
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        String s="";
        char ch[]=str.toCharArray();
        
        for(Character c:ch)
        {
            lhs.add(c);
        }
         for(Character c1:lhs)
        {
            s=s+c1;
        }
        return s;
        
        
    }


}
