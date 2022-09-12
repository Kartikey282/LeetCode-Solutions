Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

CODE -
class Solution {
    public boolean isAnagram(String s, String t) {
        int n= s.length();
        int p = t.length();
        if(n!=p)
        {
            return false;
        }
        char[] ch1 = new char[n];
        char[] ch2 = new char[n];
        for (int i = 0; i < n; i++) {
            ch1[i] = s.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            ch2[i] = t.charAt(i);
        }
        HashMap<Character, Integer> m1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> m2 = new HashMap<Character, Integer>();
        for(char i : ch1)
        {
            if(m1.containsKey(i))
            {
                m1.put(i, m1.get(i) + 1);
            }
            else
            {
                m1.put(i,1);
            }
        }
        for(char j : ch2)
        {
            if(m2.containsKey(j))
            {
                m2.put(j, m2.get(j) + 1);
            }
            else
            {
                m2.put(j,1);
            }
        }
        if(m1.equals(m2))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}