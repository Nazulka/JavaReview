public class Logic2 {
    public boolean makeBricks(int small, int big, int goal) {
        // not enough bricks
        if (goal > big*5+small) return false;
        // not enough small bricks
        if (goal%5 > small) return false;
        return true;
    }

    public int loneSum(int a, int b, int c) {
        if ((a==b) && (b==c)) return 0;
        if (a==b) return c;
        if (b==c) return a;
        if (a==c) return b;
        else return a+b+c;
    }

    public int luckySum(int a, int b, int c) {
        if (a==13) return 0;
        if (b==13) return a;
        if (c==13) return a+b;
        else return a+b+c;
    }

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }
    public int fixTeen(int n) {
        if ((n >= 13 && n <= 19) && n != 15 && n != 16) return 0;
        else return n;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }

    public int round10(int num) {
        int remainder = num % 10;

        if (remainder >=5) return num+(10-remainder);
        else return num-remainder;
    }

    public int blackjack(int a, int b) {
        if (a>21 && b>21) return 0;
        if (a>21) return b;
        if (b>21) return a;
        return (21 - a <= 21 - b) ? a : b;
        // the above is the same as the below 2 lines
//        else if (21 - a < 21 - b) return a;
//        else return b;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a + b + c - max - min;
        // since a + b + c = min + mid + max
        return (max - mid) == (mid - min);
    }

    public int makeChocolate(int small, int big, int goal) {
        int maxBigBars = goal / 5;
        int bigBarsUsed = Math.min(maxBigBars, big);
        int remaining = goal - (bigBarsUsed * 5);

        if (remaining <= small) {
            return remaining; // Number of small bars needed
        } else {
            return -1;
        }
    }

    public boolean closeFar(int a, int b, int c) {
        return ((Math.abs(a - b) <= 1) && (Math.abs(a - c) >= 2) && (Math.abs(b - c) >= 2))
                || ((Math.abs(a - c) <= 1) && (Math.abs(a - b) >= 2) && (Math.abs(b - c) >= 2));
    }














}
