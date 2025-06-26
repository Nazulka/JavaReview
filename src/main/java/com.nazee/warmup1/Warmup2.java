package com.nazee.warmup1;

public class Warmup2 {
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // avoid out-of-bounds error
        return str.substring(i+1, i+2).equals("x");
    }

}
