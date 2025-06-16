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

    public boolean nearHundred(int n) {
        if ((n >=90 && n<=110) ||  (n>=190 && n<=210)){
            return true;
        }
        return false;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public int close10(int a, int b) {
        if (Math.abs(10-a) > Math.abs(10-b)) {
            return b;
        } else if  (Math.abs(10-a) == Math.abs(10-b)) {
            return 0;
        }
        return a;
    }

    public boolean in3050(int a, int b) {
        if (((a >=30 && b>=30) && (a <=40 && b<=40)) ||  ((a >=40 && b>=40) && (a <=50 && b<=50))) {
            return true;
        }
        return false;
    }

    public boolean stringE(String str) {
        int count=0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)=='e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }

    public boolean lastDigit(int a, int b) {
        if ((a%10) == (b%10)) {
            return true;
        }
        return false;
    }

    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back  = str.substring(cut);  // this takes from cut to the end

        return front + back.toUpperCase();
    }

    public String everyNth(String str, int n) {
        StringBuilder newstr = new StringBuilder();
        for (int i=0; i<str.length(); i+=n) {
            newstr.append(str.charAt(i));
        }
        return newstr.toString();
    }

    public String missingChar(String str, int n) {
        StringBuilder newstr = new StringBuilder(str);
        newstr.deleteCharAt(n);
        return newstr.toString();
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
