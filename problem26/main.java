package problem26;

public class main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = sol.removeDuplicates(nums);
        System.out.println(result);
    }
}
