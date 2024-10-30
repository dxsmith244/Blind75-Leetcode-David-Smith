package twosum;
import java.util.HashMap;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    int n = nums.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {};
  }
}

class TimeOpitmalTwoSum {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> numMap = new HashMap<>();
    int n = nums.length;

    for (int i = 0; i < n; i++) {
      int complement = target - nums[i];
      if (numMap.containsKey(complement)) {
        return new int[] {numMap.get(complement), i};
      }
      numMap.put(nums[i], i);
    }

    return new int[] {};
  }
}
