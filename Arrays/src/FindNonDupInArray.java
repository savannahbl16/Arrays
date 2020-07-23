import java.util.Arrays;

public class FindNonDupInArray {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length) {
            if (i == nums.length - 1) {
                break;
            } else if (nums[i] == nums[i+1]) {
                i += 2;
            } else {
                break;
            }
        }
        return nums[i];
    }
}
