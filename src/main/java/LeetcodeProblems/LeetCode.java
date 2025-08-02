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
            int three = 1 <<2;
            int answer = 0;
            for (int i=0; i<=30; i++) {
                int bitmask = 1 << i;
                if ((n & bitmask) >0) {
                    answer++;
                }
            }
            return answer;
        }






}
