package com.nazee.warmup1;

public class Warmup2 {
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // avoid out-of-bounds error
        return str.substring(i+1, i+2).equals("x");
    }
//str.indexOf("x") searches your string and gives you the
// index (position) of the first occurrence of the letter "x".
}

public String stringBits(String str) {
    String newStr="";
    for (int i=0; i<str.length(); i+=2) {
        newStr += str.charAt(i);
    }
    return newStr;
}



