Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.You may assume that each input would have exactly one solution, and you may not use the same element twice.You can return the answer in any order.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
CODE-
class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        
        int n = nums.length;
        int[] k = new int[2];
        int curr=0;
        int start =0;
        int end =-1;
        
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i<n;i++)
        {
            curr = target - nums[i];
            if(map.containsKey(curr))
            {
                start = map.get(target - nums[i]);
                end = i;
                break;
            }
            map.put(nums[i],i);
        }
        k[0] = start;
        k[1] = end;
        return k;
        
        
    }
}