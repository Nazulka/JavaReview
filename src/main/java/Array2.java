public class Array2 {

    public boolean has22(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i]==2 && nums[i+1]==2) {
                return true;
            }
        } return false;
    }

    // codingBat lucky13
    public boolean lucky13(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 1 || nums[i] ==3) {
                return false;
            }
        } return true;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 2 ) {
                sum++;
            }
        }
        if (sum==4) {
            return true;
        }
        return false;
    }

    public boolean more14(int[] nums) {
        int ones= 0;
        int fours=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]==1) {
                ones++;
            } else if (nums[i]==4) {
                fours++;
            }
        }
        return ones > fours;
    }

    public boolean either24(int[] nums) {
        boolean hasTwoPair = false;
        boolean hasFourPair = false;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i]==2 && nums[i+1]==2) {
                hasTwoPair=true;
            } else if (nums[i]==4 && nums[i+1]==4) {
                hasFourPair=true;
            }
        }
        return hasTwoPair ^ hasFourPair;
    }

    public boolean has77(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i]==7 && nums[i+1]==7 ) {
                return true;
            }
        }
        for (int i=0; i<nums.length-2; i++) {
            if (nums[i]==7 && nums[i+2]==7 ) {
                return true;
            }
        }
        return false;
    }

    public boolean has12(int[] nums) {
        boolean foundOne = false;
        boolean foundTwo=false;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i]==1) {
                foundOne=true;
            }
            if (nums[i+1]==2 && foundOne) {
                return true;
            }
        } return false;
    }





}
