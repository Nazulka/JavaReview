package LeetcodeProblems;

public class DSandAlgo {
    // print yes if you can get 1 from N, No if not

    // n! factorial = 1*2*3*...*n
    // 3!=1*2*3
    // --> 2 options (+3 and +5) = O(2^n)
    // binary tree


    // 448. Find All Numbers Disappeared in an Array
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

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

        return r


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



}
