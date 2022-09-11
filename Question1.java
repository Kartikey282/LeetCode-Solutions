Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<Integer>();
        //HashSet<Integer> s = new Hashset<>(100);
        int n = nums.length;
        int flag =0;
        for(int i = 0;i<n;i++)
        {
            if(s.contains(nums[i]))
            {
                flag =1;
                break;
            }
            else
            {
                s.add(nums[i]);
            }
        }
        if(flag == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}