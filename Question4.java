Group Anagrams
/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        for(String s:strs)
        {
            char[] arr = new char[26];
            for(int i=0;i<s.length();i++)
            {
                arr[s.charAt(i)-'a']++;
            }
            String ns = new String(arr);
            
            if(map.containsKey(ns))
            {
                map.get(ns).add(s);
            }
            else
               {
                   ArrayList<String> al = new ArrayList<String>();
                   al.add(s);
                   map.put(ns ,al);
               }
        }
        res.addAll(map.values());
        return res;
        
        
    }
}