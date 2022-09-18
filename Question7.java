Valid Palindrome
/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*/
class Solution {
    public boolean isPalindrome(String s) {
        String k = s.toLowerCase();
        String str = k.replaceAll("\\s","");
        String p = k.replaceAll("[^A-Za-z0-9]","");
        int n = p.length();
        char[] ch1 = new char[n];
        int flag =0;
        for(int i=0;i<n;i++)
        {
            ch1[i]=p.charAt(i);
        }
        int i=0;
        int j= n-1;
        while(i<j)
        {
            if(ch1[i] != ch1[j])
            {
                flag = 1;
                break;
            }
            i++;
            j--;
        }
        if(flag == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}