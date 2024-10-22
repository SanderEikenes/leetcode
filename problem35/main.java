package problem35;

public class main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;

        int result = new Solution().searchInsert(nums, target3);
        System.out.println(result);
    }
}
