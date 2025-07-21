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









}
