package LeetcodeProblems;

import java.util.Arrays;

public class LeetCode {
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
        // nums      [2, 3, 1, 1, 0, 2]

        // val = 0
        // index = 0

        // final_ans [2, 3, 1, 2, _, _]
        // 4 indices (from 0 to 3) are occupied non-val elements
        return index;
    }













    }









}
