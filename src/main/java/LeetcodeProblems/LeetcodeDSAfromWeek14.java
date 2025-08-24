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

    public List<String> summaryRanges228(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        int start = 0; // start index of the current range

        for (int i = 0; i < nums.length; i++) {
            // Check if we are at the last element or the next number breaks the consecutive sequence
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
                if (start == i) {
                    // Single number range
                    result.add(String.valueOf(nums[start]));
                } else {
                    // Multiple number range
                    result.add(nums[start] + "->" + nums[i]);
                }
                start = i + 1; // Move start to the next potential range
            }
        }

        return result;
    }

    public int thirdMax414(int[] nums) {
        TreeSet<Integer> newSet = new TreeSet<>();
        for (int j : nums) {
            newSet.add(j);
        }
        Iterator<Integer> it = newSet.descendingIterator();
        int count = 0;
        while (it.hasNext()) {
            int num = it.next();
            count++;
            // do something with num
            if (count == 3) {
                return num; // 3rd largest
            }
        }
        return newSet.last();
    }

// Week 14 – Arrays Part 1/2 – HW Minimal, Problem 1
    // Azret's lecture DS&A
    public void rotate189(int[] nums, int k) {
        int n=nums.length;

        // rotating k=p*n+q times is equivelent to
        // rotating g just q times
        // q=k%n
        // Hence, replace k with q, i.e. k=k%n
        k %=n;

        // let nums = [1, 2, 3, 4, 5, 6, 7]
        // and k=3

        // reverse the whole array
        // nums = [**7, 6, 5, 4, 3, 2, 1**]
        reverse (nums, 0, nums.length-1);

        // reverse the first k element of the array
        // nums = [**5, 6, 7**, 4, 3, 2, 1]
        reverse(nums, 0, k-1);

        // reverse the rest of the array
        // nums = [**5, 6, 7**, 4, 3, 2, 1]
        reverse(nums, k, nums.length-1);

        // Final result = [5, 6, 7, 1, 2, 3, 4] as intended
    }
    // Simple (sub-array reversing algorithm)



    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // swap[nums[start], nums[end]];
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end]=temp;

            // move to the next pair of numbers
            start++;
            end--;
        }
    }

    // Week 14 – Arrays Part 1/2 – HW Minimal, Problem 2
    public void sortColors75solution2(int[] nums) {
        // we want to insert 0s one by one into their positions
        // starting from index 0
        int zeroInsertPos = 0;

        // we want to insert 2s one-by-one into their positions
        // starting from the last index (nums.length-1)
        int twoInsertPos = nums.length-1;

        // initiate iterator
        int i=0;

        // everything to the right of twoInsertPos is rightfully filled with 2s
        // when iterator goes  into the territory of 2s, stop
        while (i<= twoInsertPos) {
            if (nums[i] == 0) {
                // if we see a 0, put it into its respective position
                // i.e. we do swap (nums[zeroInsertPOs], nums[i])
                swap(nums, zeroInsertPos, i);
                zeroInsertPos++;
                i++;
            } else if (nums[i] ==1) {
                // if we see a 1, just leave it to be where it is
                i++;
            } else {
                // nums[i] ==2
                // if we see a 2, put it into its respective position
                // i.e. we do a swap(nums[i], nums[twoInsertPos])
                swap(nums, i, twoInsertPos);
                twoInsertPos--;
                // don't advance i to (i+1) becuse if nums[i] after swap// equals 0, then we should put that 0 to its respective position
                // so don#t advance yet - wait until the next iteration on i
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

//    Week 14 – Arrays Part 1/2 – HW Minimal, Problem 3
    public void merge88(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m-1; // pointer at the largest value in nums1
        int tail2 = n-1; // pointer at largest value in nums2
        int insertPosition = m+n-1;
        // the very end of nums1, where we will start putting the merging arrays nums1 and nums2 keep merging until we run out of elements in nums2
        while (tail2 >=0) {
            if (tail1 >= 0 && nums1[tail1] > nums2[tail2]) {
                // if nums1 has the next element and if it is greater then then
                // next element in nums2, then put the next element from nums1 in the
                // insertPosition
                // and decrement both insertPOsition and tail1
                nums1[insertPosition] = nums1[tail1];
                tail1--;
            } else {
                // otherwise, put the next element from nums2
                // in the insertPOsition and decrement both
                // insertPOsition and tail2
                nums1[insertPosition] = nums2[tail2];
                tail2--;
            }
            insertPosition--;
        }
    }

    public int[] sortedSquares977(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int pos = n-1;
        int left = 0;
        int right = nums.length - 1;
        while(left<=right) {
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                result[pos] = nums[left]*nums[left];
                left++;
            } else {
                result[pos] = nums[right]*nums[right];
                right--;
            }pos--;
        }
        return result;
    }

    // Week 14 – Arrays Part 1/2 – HW Minimal, Problem 4
    public int[] sortArrayByParityII922(int[] nums) {

        int i = 0;
        int j = 1;
        int n = nums.length;

        while (i<n && j<n) {
            // find the next odd integer at an even position
            while (i<n && nums[i]%2==0) {
                i+=2;
            }
            // find the next even integer at an odd position
            while (j<n && nums[j]%2==1) {
                j+=2;
            }
            // if both found swap them
            if (i<n && j<n) {
                swap(nums, i, j);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
    }

// ====================================================

    class NumArray {
        // Week 14 – Arrays Part 1/2 – HW Minimal, Problem 5 leetcode 303
// go through again!
        private int[] prefix;

        public NumArray(int[] nums) {
            int n = nums.length;
            // prefix array is 1-indexed because it greatly simplifies computations
            // if prefix array would be 0-indexed, we'd have to always consider the case
            // when i=0 or left =0 separately, so we don't gp out of bounds
            prefix = new int[n+1];
            // prefix[0 . .. n]

            // prefix[0]=0 because it is semantically equal to an empty prefix (which has zero sum)
            prefix[0]=0;
            for (int i=1; i<=n; i++) {
                // prefix[i]=
                //           sum(nums[1.. i-1]) +
                //           nums[i]
                prefix[i] = prefix[i-1]+nums[i-1];
                // nums[i-1] (not nums[i] because nums array is 0-indexed)
            }
        }

        public int sumRange(int left, int right) {
            // increment by 1 because 'prefix' array is 1-indexed
            left++;
            right++;
            // nums[left] + ... + nums[right]
            //=
            // sum(nums[1.. right])-
            // sum(nums[1 .. left-1]) =
            // sum(nums[left .. right])
            return prefix[right] - prefix[left-1];
        }
    }

/** ["NumArray", "sumRange", "sumRange", "sumRange"]
 [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
 Output
 [null, 1, -1, -3] **/

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */


class NumMatrix {
    // Week 14 – Arrays Part 1/2 – HW Recommended, Problem 1
    int [][] sum;
    // matrix[row][column]
    public NumMatrix304(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

// sum [i][j] is the sum of all elements
// inside the prefix-submatrix matrix[1..i][1 .. j]

// sum is a 1 indexed matrix whereas matrix is 0-indexed
// this is intentional to simplify computations
// if you make sum matrix 0-indexed, you'll have to
// write many if statements to check that you didn't go out of bounds
// assume its 0-th row (sum[0][...]) and 0-th column (sum[...][0]) are filled with zeroes
// that greatly simplifies the computations

        sum = new int [m+1][n+1];
//for (int r = 0; r < rows; r++)
// for (int c = 0; c < cols; c++)
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                // sum of all elems from (1, 1) till (i, j) =
                sum[i][j]=
                        (sum[i-1][j] +
                                sum[i][j-1] - // (because they were added twice)
                                sum[i-1][j-1]) +
                                matrix[i-1][j-1]; // because matrix is actually 0-indexed
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        // since our sum matrix is 0-indexed and given r1, c1, r2, c2 are 0-indexed,
        // we increase all by 1
        row1++;
        col1++;
        row2++;
        col2++;
        return (sum[row2][col2] -
                sum[row2][col1-1] -
                sum[row1-1][col2] +
                sum[row1-1][col1-1]);
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
















}
