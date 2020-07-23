import java.util.Arrays;

/**Given an array of integers, find if the array contains any duplicates.

 Your function should return true if any value appears at least twice in the array,
 and it should return false if every element is distinct. **/

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); //sort array so duplicates are grouped
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1 && nums[i] == nums[i+1]) { // if an element equals its next element, return true
                return true;
            }
        }
        return false; // returned if no duplicates
    }
}
