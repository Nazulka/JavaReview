package LeetcodeProblems;

public class LeetcodeDSAfromWeek14 {
    public int searchInsert(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            if ((nums[i]==target) || (nums[i]>target))  {
                return i;
            }
        } return nums.length;
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> newSet = new HashSet<Integer>();
        for (int i=0; i<nums.length; i++) {

            if (newSet.contains(nums[i])) {
                return true;

            }  newSet.add(nums[i]);
        }return false;
    }

    public boolean containsNearbyDuplicateA(int[] nums, int k) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if ((nums[i]==nums[j]) && Math.abs(i-j)<=k) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (newSet.contains(nums[i])) {
                return true;
            }
            newSet.add(nums[i]);
            if (newSet.size() > k) {
                newSet.remove(nums[i - k]);
            }
        }
        return false;
    }


    // Solved in class with Shabdan
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<Integer>();
        for (int i=0; i<nums1.length; i++) {
            for (int j=0; j<nums2.length; j++) {
                if (nums1[i]==nums2[j]) {
                    result.add(nums1[i]);
                }
            }
        }
        int[] arrResult = new int[result.size()];
        int index=0;
        for (int num:result) {
            arrResult[index++]=num;
        }
        return arrResult;
    }

        public int[] intersectionOptimised(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int m = nums2.length;
            Set<Integer> set_1 = new HashSet<Integer>();
            Set<Integer> ans = new HashSet<Integer>();

            for (int i = 0; i < n; i++) {
                set_1.add(nums1[i]); // O(1) in average
            }
            // O(n)

            for (int i = 0; i < m; i++) {
                if (set_1.contains(nums2[i])) { // O(1) in average
                    ans.add(nums2[i]); // O(1) in average
                }
            }
            // O(m)


            int[] answer = new int[ans.size()];

            int ind = 0;
            for (Integer x : ans) {
                answer[ind] = x;
                ind++;
            }
            return answer;
        }











}
