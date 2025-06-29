package com.nazee.warmup1;

public class Warmup2a {

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

public String stringSplosion(String str) {
    String newStr="";
    for (int i=0; i<str.length(); i++) {
        newStr += str.substring(0, i+1);
    }
    return newStr;
}
// i=0
// str.substring(0, 1) → "C"
//newStr = "" + "C" → "C" >> C
// i=1;
//str.substring(0, 2) → "Co"
//newStr = "C" + "Co" → "CCo" >> CCo

public String stringSplosion(String str) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
        result.append(str.substring(0, i + 1));
    }
    return result.toString();
}

public int last2(String str) {
    if (str.length() < 2) {
        return 0;
    }
    // Saves the last 2 characters of the string.
    String last = str.substring(str.length() - 2);
    int count = 0;
    for (int i = 0; i < str.length() - 2; i++) {
// Loop from the start of the string up to the third-to-last character.
//This ensures we don't include the final 2 characters themselves.
        String sub = str.substring(i, i + 2);
//  Gets the current 2-character substring starting at position i.
        if (sub.equals(last)) {
            count++;
        }
    }
    return count;

    }

public int arrayCount9(int[] nums) {
    int count=0;
    for (int i=0; i<nums.length; i++) {
        if (nums[i]==9) {
            count++;
        }
    }return count;
}

public boolean arrayFront9(int[] nums) {
    int firstFour = Math.min(4, nums.length);
    for (int i=0; i<firstFour; i++) {
        if (nums[i]==9) {
            return true;
        }

    } return false;
}

public boolean array123(int[] nums) {
    if (nums.length < 3) {
        return false;
    }
    for (int i=0; i<nums.length-2; i++) {
        if (nums[i] ==1 && nums[i+1] == 2 && nums[i + 2] == 3) {
            return true;
        }
    }return false;
}

int countXX(String str) {
    int count = 0;
    for (int i = 0; i < str.length()-1; i++) {
        if (str.substring(i, i+2).equals("xx")) count++;
    }
    return count;
}

// Solution notes: the loop is shortened to end at str.length()-1
// so we can pull out a length 2 substring without going out of bounds.
// Remember to use equals() to compare strings, not ==.

public String stringX(String str) {
    if (str.length() <= 2) return str; // Nothing to remove in very short strings

    String start = str.substring(0, 1);                    // First character
    String end = str.substring(str.length() - 1);          // Last character
    String middle = str.substring(1, str.length() - 1);    // Middle part

    middle = middle.replace("x", ""); // Remove all 'x' in the middle

    return start + middle + end;
}

public String altPairs(String str) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < str.length(); i += 4) {
        result.append(str.charAt(i));           // Take index i
        if (i + 1 < str.length()) {
            result.append(str.charAt(i + 1));
            // Take index i+1 if it exists
        }
    }
    return result.toString();
}

public String stringYak(String str) {
    StringBuilder result=new StringBuilder();
    for (int i=0; i<str.length(); i++) {
        if (i + 2 < str.length() && str.charAt(i) == 'y'
                && str.charAt(i+2) == 'k') {
            i+=2;
        } else {
            result.append(str.charAt(i));
        }
    }

    return result.toString();
}
