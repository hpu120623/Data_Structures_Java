package LeetCode;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];

        // 建立k-v，一一对应的哈希表
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(target - nums[i])) {
                indexs[0] = hash.get(target - nums[i]);
                indexs[1] = i;
                return indexs;
            }
            hash.put(nums[i], i);
        }
        return indexs;
    }
}
