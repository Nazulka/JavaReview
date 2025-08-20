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













}
