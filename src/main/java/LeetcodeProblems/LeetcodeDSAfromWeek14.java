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

    public boolean containsNearbyDuplicateB(int[] nums, int k) {
        Set<Integer> newSet = new HashSet<Integer>();
        for (int i=0; i<i+k; i++) {

            if (newSet.contains(nums[i])) {
                return true;
            }
            newSet.add(nums[i]);
            window.newSet(nums[i - k]);
        }
        return false;
    }










}
