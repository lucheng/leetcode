package org.cheng;

import java.util.Arrays;

/**
 * 最接近的三数之和
 * 标签：排序和双指针
 * @author lucheng
 *
 */
public class Solution2 {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for(int i=0;i<nums.length;i++) {
            int start = i+1, end = nums.length - 1;
            while(start < end) {
                int sum = nums[start] + nums[end] + nums[i];
                if(Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                if(sum > target)
                    end--;
                else if(sum < target)
                    start++;
                else
                    return ans;
            }
        }
        return ans;
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] nums = { 0,0,0 };
		int target = 1;
		System.out.println(s.threeSumClosest(nums, target));
	}
}
