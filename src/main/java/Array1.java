public class Array1 {
    public boolean firstLast6(int[] nums) {
        return nums[0]==6 || nums[nums.length-1]==6;
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length>=1 && nums[0]==nums[nums.length-1];
    }

    public int[] makePi() {
        int[] makePi = new int [3];
        makePi[0] = 3;
        makePi[1]=1;
        makePi[2]=4;
        return makePi;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0]==b[0] || a[a.length-1]==b[b.length-1];
    }

    public int sum3(int[] nums) {
        return nums[0]+nums[1]+nums[2];
    }

    public int[] reverse3(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        } return nums;
    }

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = max;
        }
        return nums;
    }

    public int sum2(int[] nums) {
        if (nums.length==0) return 0;
        if (nums.length>=2) return nums[0]+nums[1];
        else return nums[0];
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] middleSum = new int [2];
        middleSum[0]=a[1];
        middleSum[1]=b[1];
        return middleSum;
    }




}
