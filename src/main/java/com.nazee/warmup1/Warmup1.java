package com.nazee.warmup1;

public class Warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            return true;
        }
        return false;

    }
    public int sumDouble(int a, int b) {
        if (a != b) {
            return a+b;
        }
        return 2*(a+b);
    }

    public int diff21(int n) {
        if (n <= 21) {
            return Math.abs(n-21);
        }
        return Math.abs(2*(n-21));
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour<7 || hour>20)) {
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        if ((a==10 || b==10) || (a+b) ==10) {
            return true;
        }
        return false;
    }







//    public static void main(String[] args) {
//        // To call these methods, you often need to create an "instance" of the class.
//        // Or, you can make the methods 'static' if you prefer, but let's stick to instances for now.
//        Warmup1 solver = new Warmup1();
//
//        System.out.println("--- Testing sleepIn ---");
//        System.out.println("sleepIn(false, false): " + solver.sleepIn(false, false)); // Expected: true
//        System.out.println("sleepIn(true, false): " + solver.sleepIn(true, false));   // Expected: false
//        System.out.println("sleepIn(false, true): " + solver.sleepIn(false, true));   // Expected: true
//        System.out.println("sleepIn(true, true): " + solver.sleepIn(true, true));     // Expected: true
//
//
//    }
}
