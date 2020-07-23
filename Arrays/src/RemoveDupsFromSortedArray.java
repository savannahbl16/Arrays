/**Given a sorted array nums, remove the duplicates in-place such that each element appear only once
 and return the new length.
 Do not allocate extra space for another array, you must do this by modifying the input array in-place
 with O(1) extra memory. **/

public class RemoveDupsFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0; // keep track of index in sorted array nums
        int j = 1; // variable to iterate past duplicates
        int length = 1; // number of non duplicate elements
        while (j < nums.length) {
            // iterate past the duplicates
            if (nums[i] == nums[j]) {
                j++;
            } else { // if it is not a duplicate, move to the next index in the sorted array
                nums[i+1] = nums[j];
                i++;
                length++;
            }
        }
        return length;
    }
}
