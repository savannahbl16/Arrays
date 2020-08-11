import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int fixed = nums[i] * -1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    int toFind = fixed - nums[j];
                    if (map.containsKey(toFind) && map.get(toFind) != j && map.get(toFind) != i) {
                        List<Integer> toAdd = new ArrayList<>();
                        toAdd.add(nums[i]);
                        toAdd.add(nums[j]);
                        toAdd.add(toFind);
                        Collections.sort(toAdd);
                        if (!list.contains(toAdd)) {
                            list.add(toAdd);
                        }
                    }
                }
            }
        }
        return list;
    }
}
