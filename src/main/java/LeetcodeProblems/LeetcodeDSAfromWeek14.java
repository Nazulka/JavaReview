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










}
