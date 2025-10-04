package LeetcodeProblems;

import java.util.ArrayList;

public class DSandAlgo {
    // print yes if you can get 1 from N, No if not

    // n! factorial = 1*2*3*...*n
    // 3!=1*2*3
    // --> 2 options (+3 and +5) = O(2^n)
    // binary tree


    // 448. Find All Numbers Disappeared in an Array
    public ArrayList<Object> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Object> result = new ArrayList<>();

        // check each number from 1..n
        for (int i = 1; i <= n; i++) {
            boolean found = false;

            // search for i in nums
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break; // no need to keep checking
                }
            }

            // if not found, then i is missing
            if (!found) {
                result.add(i);
            }
        }
        return result;
    }


        // problem 268 Missing Number
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int expectedSum = n * (n + 1) / 2; // sum of 0..n
            int actualSum = 0;
            for (int num : nums) {
                actualSum += num; // sum of array
            }
            return expectedSum - actualSum; // missing number
        }

    public boolean isEverywhere(int[] nums, int val) {
        for (int i=0; i<nums.length-1; i++) {
            if (val!=nums[i] && val!=nums[i+1]) {
                return false;
            }
        }return true;
    }

    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                // Check if it has a 2 before or after
                boolean hasPrev = (i > 0 && nums[i - 1] == 2);
                boolean hasNext = (i < nums.length - 1 && nums[i + 1] == 2);
                if (!hasPrev && !hasNext) {
                    return false; // isolated 2 found
                }
            }
        }
        return true;
    }







}
