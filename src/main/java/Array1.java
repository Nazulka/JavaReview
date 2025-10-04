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

    public int[] makeEnds(int[] nums) {
        int[] firstLast = new int[2];
        firstLast[0]=nums[0];
        firstLast[1]=nums[nums.length-1];
        return firstLast;
    }

    public boolean has23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean no23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return false;
            }
        }
        return true;
    }

    public int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        int last = nums[nums.length-1];
        result[result.length-1]=last;
        return result;
    }

    public boolean double23(int[] nums) {
        int countTwo=0;
        int countThree=0;
        for (int num : nums) {
            if (num == 2) {
                countTwo++;
            } else if (num == 3) {
                countThree++;
            }
        }
        return countTwo >= 2 || countThree >= 2;
    }

    public int[] fix23(int[] nums) {
        int[] result = new int[3];
        for (int i=0; i<nums.length; i++) {
            result[i]=nums[i];
            if(nums[i]==2 && nums[i+1] == 3) {
                nums[i+1]=0;
            }
        } return result;
    }

    public int start1(int[] a, int[] b) {
        int count =0;
        if (a.length>0 && a[0]==1) count++;
        if (b.length>0 && b[0]==1) count++;
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int aSum = a[0]+a[1];
        int bSum= b[0]+b[1];
        if (aSum==bSum) return a;
        if (aSum>bSum) return a;
        else return b;
    }

    public int[] makeMiddle(int[] nums) {
        int [] result = new int[2];
        int middle = nums.length/2;
        result[0]= nums[middle-1];
        result[1]=nums[middle];
        return result;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[4];
        result[0] = a[0];
        result[1] = a[1];
        result[2] = b[0];
        result[3] = b[1];
        return result;
    }

    public int[] swapEnds(int[] nums) {
        int start = nums[0];
        int end = nums[nums.length-1];
        nums[0] = end;
        nums[nums.length-1]=start;
        return nums;
    }

    public int[] midThree(int[] nums) {
        int [] result = new int[3];
        int middle = nums.length/2;
        result[0]=nums[middle-1];
        result[1]=nums[middle];
        result[2]=nums[middle+1];
        return result;
    }

    public int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        return Math.max(first, Math.max(middle, last));
    }

    public boolean unlucky1(int[] nums) {
        int len = nums.length;

        // Check beginning (index 0 and 1)
        if (len >= 2 && nums[0] == 1 && nums[1] == 3) return true;

        // Check middle (index 1 and 2)
        if (len >= 3 && nums[1] == 1 && nums[2] == 3) return true;

        // Check end (last two elements)
        if (len >= 2 && nums[len - 2] == 1 && nums[len - 1] == 3) return true;

        return false;
    }

    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int count = 0;
        // Fill from a
        for (int i = 0; i < a.length && count < 2; i++) {
            result[count] = a[i];
            count++;
        }
        // Fill from b
        for (int i = 0; i < b.length && count < 2; i++) {
            result[count] = b[i];
            count++;
        }
        return result;
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length>0 && b.length>0) {
            return new int[] {a[0], b[0]};
        }
        else if
        (b.length>0) {
            return new int[] {b[0]};
        }
        else if (a.length>0) {
            return new int[] {a[0]};
        } else {
            return new int[] {};
        }
    }

    public int[] rotateLeft3(int[] nums) {
        int first = nums[0];
        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = first;
        return nums;
    }

    public int[] rr(int[] nums) {
        if (nums.length<2) return nums;
        else return new int[] {nums[0], nums[1]};
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        return (temp >= 60 && temp <= 90 && !isSummer) ||
                (temp >= 60 && temp <= 100 && isSummer);
    }

    public boolean only14(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            if (nums[i]!=1 && nums[i]!=4) {
                return false;
            }
        } return true;
    }

    public boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) has1 = true;
            if (nums[i] == 4) has4 = true;
        }

        return !(has1 && has4); // true if NOT both
    }

















}
