package LeetcodeProblems;

import java.util.Arrays;
import java.util.List;

public class LeetCodew11_14 {
    public int maxProfit(int[] prices) {
        int lowest_price_so_far = prices[0];
        int highest_profit = 0;
        for (int todays_price : prices) {
            highest_profit = Math.max(highest_profit, todays_price - lowest_price_so_far);
            lowest_price_so_far = Math.min(lowest_price_so_far, todays_price);
        }
        return highest_profit;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        Arrays.sort(schars);
        Arrays.sort(tchars);
        return Arrays.equals(schars, tchars);
    }

    public int hammingWeight(int n) {
        int one = 1 << 0;
        int two = 1 << 1;
        int three = 1 << 2;
        int answer = 0;
        for (int i = 0; i <= 30; i++) {
            int bitmask = 1 << i;
            if ((n & bitmask) > 0) {
                // we can also compute
                // x | y
                // x ^ y
                // x >> 1 right shift by one is dividing by 2
                answer++;
            }
        }
        return answer;
    }

    public int singleNumber(int[] nums) {
        // XOR operation - exclusive OR
        // If only one of them is true then is true, otherwise it's false
        // 0 ^ 0 = 0
        // 0 ^ 1 = 1
        // 1 ^ 1 = 0
        // similar answers will cancel each other out
        // return the number that appears once
        int answer = 0;
        for (int num : nums) {
            answer = answer ^ num; // answer ^=num;
        }
        return answer;
    }

    public void reverseString1(char[] s) {
        char[] t = new StringBuilder(new String(s)).reverse().toString().toCharArray();
        System.arraycopy(t, 0, s, 0, s.length);
    }

    public String reverseString2(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        return null;
    }

    public int finalPositionOfSnake(int n, List<String> commands) {
        int row=0;
        int col=0;
        for (String command : commands) {
            if (command.equals("UP")) {
                row--; // same as -3
            } else if (command.equals("DOWN")) {
                row++; // same as +3
            } else if (command.equals("RIGHT")) {
                col++; // i++
            } else if (command.equals("LEFT")) {
                col--; // i--
            }

        }
        return row*n+col;
    }

    public int finalPositionOfSnake2(int n, List<String> commands) {
        int number =0;
        for (String command : commands) {
            // think as if it is a one dimensional array
            if (command.equals("UP")) {
                number -=n;
            } else if (command.equals("DOWN")) {
                number +=n;
            } else if (command.equals("RIGHT")) {
                number++;
            } else if (command.equals("LEFT")) {
                number--;
            }
        }
        return number;
    }

    public int removeElement27(int[] nums, int val) {
        int index=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums [index] = nums[i];
                index++;
            }
        }
        // i          *
        // indices    0  1  2  3  4  5
        // nums      [2, 3, 1, 2, 0, 2]

        // val = 0
        // index = 0

        // final_ans [2, 3, 1, 2, _, _]
        // 4 indices (from 0 to 3) are occupied non-val elements
        return index;
    }

    public int reverseBits(int n) {
        // treat n as an unsigned value - as a binary number
        int result = 0;
        for (int i=0; i<=31; i++) {
            int bit = (n>>i) &1;
            if (bit==1) { // if n's i-th bit is true, then
                result |=1 << (31-i); // set true the result's (31-i)-th bit
            }
        }
        return result;
    }

    public int firstUniqChar387(String s) {
        int freq[] = new int[26];
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            freq[c-'a']++;
        }
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c-'a'] == 1) {
                return i;
            }
        }
        return -1;
    }


    public int firstUniqChar(String s) {
        int bestIndex=1000000000;
        for (char c='a'; c<='z'; c++) {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if (first != -1 && first == last) {
                bestIndex = Math.min(bestIndex, first);
            }
        }
        if (bestIndex == 1000000000) bestIndex = -1;
        return bestIndex;
    }

    public int removeDuplicates26(int[] nums) {
        // start from one as 0 is nin-duplicate
        int j=1;
        // we will put non-duplicates at p[ositions
        // 0, 1, 2, 4 etc one bu one
        for (int i=1; i<nums.length; i++) {
            if (nums[i]==nums[i-1]) {
                // if it's a duplicate, skip it
                continue;
            }
// otherwise (n) put it at index j,
            // and then increment j
            nums[j] = nums[i];
            j++;
        }
        return j;
    }

    public int[][] construct2DArray2022(int[] original, int m, int n) {
        if (original.length != m*n){
            return new int[0][0];
        }
        int [][] arr = new int [m][n];
        int current_index = 0;
        for (int i=0; i<m; i++) { // top to bottom
            for (int j=0; j<n; j++) { //left to right over the columns
                arr [i][j] = original[current_index];
                // ans[0][0] → first row, first column
                // original[0] → first number in the 1D array → 1
                current_index++;
            }
        }
        return arr;
    }

    public int[][] construct2DArray2(int[] original, int m, int n) {
        if (original.length != m*n){
            return new int[0][0];
        }
        int [][] arr = new int [m][n];
        for (int i=0; i<original.length; i++) {
            arr[i/n][i%n] = original[i];
        }
        return arr;
    }


        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length==0) {
                return "";
            }
            // initialise 'prefix' with the longest possible prefix
            // prefix cannot be longer then any of the strings, so we take the 1st string
            // and initialise with strs[0];
            String prefix=strs[0];

            // Iterate over all strings
            for (int i=1; i<strs.length; i++) {
                // until 'prefix' is not a prefix of the current string
                // reduce 'prefix' by one character and try to match again
                while (strs[i].indexOf(prefix) !=0) {
                    // if you compare a string to an empty string it returns 0;
                    // removing the last character from 'prefix'
                    prefix = prefix.substring(0, prefix.length()-1);
                }
            }
            // return found 'prefix' as it is a prefix of all strings in the list
            return prefix;
        }

    public void moveZeroes283(int[] nums) {
        if (nums==null || nums.length == 0) {
            return;
        }
        // insert non-zero values at the beginning
        // of the array, one by one
        int insertPosition = 0;
        for (int num:nums) {
            if (num !=0) {
                nums[insertPosition++]=num;
            }
        }
        // fill the rest of the position with 0
        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }
    }

//    class Solution {
        public boolean backspaceCompare844(String s, String t) {
            return build(s).equals(build(t));
        }
// private class inside
        private String build(String str) {
            StringBuilder buildStr = new StringBuilder();
            for (char c : str.toCharArray()) {
                if (c != '#') { // if it's not a # char, append it
                    buildStr.append(c);
                } else { // if it's a #
                    if (!buildStr.isEmpty()) { // if buildStr isn't empty
                        buildStr.deleteCharAt(buildStr.length()-1);
                        // remove last char
                    }
                }
            }
            return buildStr.toString();
            // convert the string builder class to string and return it
        }
//    }

    public int removeDuplicates(int[] nums) {
        // to find out if the number is a 3rd occurence - duplicate,
        // check the prev 2 elements

        // Numbers nums[0] and nums[1] will stay where they are
        // if we were checking if there were 3 occurences, we'd start from
        // insertPosition =3
        // and change this line to 3:
        //if (nums[i] != nums[insertPosition - 3]) {
        // and start the for loop from i=3
        int insertPosition = 2;

        // we will iterate over numbers starting from i=2
        // and numbers we need at insertPosition one by one
        for (int i=2; i<nums.length; i++) {
            if (nums[i] != nums[insertPosition - 2]) {
                nums[insertPosition++] = nums[i];
            }
        }
        return insertPosition;
    }

    public void merge88(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m-1; // pointer at the largest value in nums1
        int tail2 = n-1; // pointer at largest value in nums2
        int insertPosition = m+n-1;
        // the very end of nums1, where we will start putting
        // the merging arrays nums1 and nums2

        // keep merging until we run out of elements in nums2
        while (tail2 >=0) {
            if (tail1>=0 && nums1[tail1] > nums2[tail2]) {
                // if nums1 has the next element and if it is greater then then
                // next element in nums2, then put the next element from nums1 in the
                // insertPosition
                // and decrement both insertPOsition and tail1
                nums1[insertPosition--] = nums1[tail1--];
            } else {
                // otherwise, put the next element from nums2
                // in the insertPOsition and decrement both
                // insertPOsition and tail2
                nums1[insertPosition--] = nums2[tail2--];
            }
        }
    }

    public int[] pivotArray2161(int[] nums, int pivot) {
        int n = nums.length;
        int [] result  = new int[n];
        int insertPosition = 0;
        // the arr will be split into 3 blocks
        // [(numbers<pivot), (number=pivot), (numbers>pivot)]

        int pivotFreq = 0;
        for (int num: nums) {
            if (num<pivot) {
                result[insertPosition]=num;
                insertPosition++;
            } else if (num == pivot) {
                pivotFreq++;
            }
        }
        // insert all num=pivot
        while (pivotFreq > 0) {
            result[insertPosition]=pivot;
            insertPosition++;
            pivotFreq--;
        }

        // after that, insert the rest, all num>pivot
        for (int num:nums) {
            if (num>pivot) {
                result[insertPosition]=num;
                insertPosition++;
            }
        }
        return result;
    }

    public int[] plusOne66(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
    }

    public List<Integer> spiralOrder54(int[][] matrix) {
        List<Integer> res= new ArrayList<Integer>();
        if (matrix.length==0 || matrix[0].length==0) {
            return res;
        }
        int top=0;
        int bottom=matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(true) {
            // 1. iterate over top row, left to right
            for (int i=left; i<=right; i++) res.add(matrix[top][i]);
            if (++top>bottom) break;
            // 2. iterate over right column, top to bottom
            for (int i=top; i<=bottom; i++) res.add(matrix[i][right]);
            if (left>--right) break;
            // 3. Iterate over bottom row, right to left
            for (int i=right; i>=left; i--) res.add(matrix[bottom][i]);
            if (top>--bottom) break;
            // 4. Iterate over left column, bottom to top
            for (int i=bottom; i>=top; i--) res.add(matrix[i][left]);
            if (++left > right) break;
        }
        return res;
    }




































}
