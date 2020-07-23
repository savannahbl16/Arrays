public class removeDupsFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int length = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[i+1] = nums[j];
                i++;
                length++;
            }
        }
        return length;
    }
}
