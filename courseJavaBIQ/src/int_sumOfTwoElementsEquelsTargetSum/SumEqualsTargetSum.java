package int_sumOfTwoElementsEquelsTargetSum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumEqualsTargetSum {
    public static void main(String[] args) {
        int targetSum = 8;
        int[] nums = {1, 5, 7, 9, 3};

        sum(nums, targetSum);

    }

    public static int[] sum(int[] number, int targetSum) {
        Set<Integer> set = new HashSet<>();
        int[] result = new int[2];
        for (int i = 0; i < number.length; i++) {
            set.add(number[i]);
            if (set.contains(targetSum - number[i])) {
                result[0] = number[i];
                result[1] = targetSum - number[i];
                System.out.println("FirstNum : " + result[0] + " SecondNum : " + result[1]);
                return result;
            }
        }
        return new int[0];
    }

    // O(n)
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // O(n)
    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
  // complex O(n^2) ,Space O(1)
    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
