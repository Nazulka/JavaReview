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

    public String frontBack(String str) {

        if (str.length() <= 1) {
            return str;
        }

        StringBuilder sb = new StringBuilder(str);
        int i = 0;
        int j = str.length() - 1;

        char ci = sb.charAt(0);
        char cj = sb.charAt(str.length() - 1);

        sb.setCharAt(i, cj);
        sb.setCharAt(j, ci);

        return sb.toString();
    }

    public String front3(String str) {
        if (str.length() < 3) {
            return str+str+str;
        }
        String first = str.substring(0, 3);
        return first+first+first;
    }

    public String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

    public boolean or35(int n) {
        if (n%3==0 || n%5==0) {
            return true;
        } return false;

    }
    public String front22(String str) {
        if (str.length()<2) {
            return str+str+str;
        }
        String firstTwo =str.substring(0, 2);
        return firstTwo +str+firstTwo;
    }

    public boolean startHi(String str) {
        if (str.length() < 2) return false;

        String first = str.substring(0, 2);
        if (first.equals("hi")) {
            return true;
        } return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1<0 || temp2<0) && (temp1>100 || temp2>100)) {
            return true;
        }
        return false;
    }
    public boolean in1020(int a, int b) {
        if ((a>=10 && a<=20) || (b>=10) && (b<=20)) {
            return true;
        } return false;
    }

    public boolean hasTeen(int a, int b, int c) {
        if ((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)) {
            return true;
        } return false;
    }

    public boolean loneTeen(int a, int b) {
        if ((a>=13 && a<=19) ^ (b>=13 && b<=19)) {
            return true;
        }
        return false;
    }

    public String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).contains("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    public boolean mixStart(String str) {
        if (str.length()>=3 && str.substring(1, 3).equals("ix")) {
            return true;
        }
        return false;
    }

    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    public int intMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int close10a(int a, int b) {
        if (Math.abs(10 - a) < Math.abs(10 - b)) {
            return a;
        } else if (Math.abs(10 - a) == Math.abs(10 - b)) {
            return 0;
        }
        return b;
    }

    public String notString(String str) {
        String not = "not";
        if (str.length()>=3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return not + " " + str;
    }

    public String stringTimes(String str, int n) {
        String newStr="";
        for (int i=0; i<n; i++) {
            newStr += str;
        }
        return newStr;
    }

    public String frontTimes(String str, int n) {
        int frontlength = 3;
        if (frontlength > str.length()) {
            frontlength = str.length();
        }
        String firstThree = str.substring(0, frontlength);
        String result = "";
        for (int i=0; i<n; i++) {
            result += firstThree;
        }
        return result;
    }

    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }
// str.substring(i, i + 2) takes two characters: one at i and one at i+1
    // It checks if those two are "xx"
    //If so, it increments count
// Solution notes: the loop is shortened to end at str.length()-1
// so we can pull out a length 2 substring without going out of bounds.
// Remember to use equals() to compare strings, not ==.












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
