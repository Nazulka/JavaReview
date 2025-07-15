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






}
