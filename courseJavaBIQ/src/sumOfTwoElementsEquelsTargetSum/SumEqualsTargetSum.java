package sumOfTwoElementsEquelsTargetSum;

import java.util.HashSet;
import java.util.Set;

public class SumEqualsTargetSum {
    public static void main(String[] args) {
        int targetSum = 8;
        int[] nums = {1,5,7,9,3};

        sum(nums,targetSum);

    }
    public static int[] sum (int[] number , int targetSum) {
        Set<Integer> set = new HashSet<>();
        int [] result = new int[2];
        for(int i=0; i< number.length; i++){
            set.add(number[i]);
            if(set.contains(targetSum-number[i])){
                result[0] = number[i];
                result[1] = targetSum-number[i];
                System.out.println("FirstNum : " + result[0] + " SecondNum : " + result[1]);
                return result;
            }
        }
        return new int[0];
    }
}
