import java.util.Arrays;

/** Given a non-empty array of integers, every element appears twice except for one. Find that single one.

 Note:

 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?**/

public class FindNonDupInArray {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums); // sort array so duplicates are grouped
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i+1]) { // if current element equals next element, skip past to next number
                i += 2;
            } else {
                break; // found a non duplicate
            }
        }
        return nums[i]; // return non duplicate
    }
}
