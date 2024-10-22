package problem26;

import java.util.ArrayList;

public class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> seen = new ArrayList<Integer>();

        for (int i=0; i<nums.length; i++) {
            if (seen.contains(nums[i])) {
                continue;
            }
            seen.add(nums[i]);
            nums[seen.size()-1] = nums[i];
        }
        int solutionnumber = seen.size();
        return solutionnumber;
    }
}
