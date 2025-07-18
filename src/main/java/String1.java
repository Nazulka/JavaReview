public class String1 {
    public String helloName(String name) {
        String greetings = "Hello " + name +"!";
        return greetings;
    }

    public String makeAbba(String a, String b) {
        String result = a+b+b+a;
        return result;
    }

    public String makeTags(String tag, String word) {
        String tags = "<" + tag + ">" +word+"</" + tag + ">";
        return tags;
    }

    public String makeOutWord(String out, String word) {
        String start = out.substring(0, 2);
        String end = out.substring(2, 4);
        return start + word + end;
    }

    public String extraEnd(String str) {
        String end = str.substring(str.length()-2);
        return end + end + end;

        // Solution notes: the last two chars begin at index str.length()-2
        // Here we store the chars in a local variable, which makes the code
        // longer but simpler.
    }

    public String firstTwo(String str) {
        if (str.length()<2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    public String firstHalf(String str) {
        int first = str.length()/2;
        return str.substring(0, first);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }

    public String comboString(String a, String b) {
        if (a.length()> b.length()) {
            return b+a+b;
        } else {
            return a+b+a;
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        String lastTwo = str.substring(str.length()-2);
        return lastTwo+str.substring(0, str.length()-2);
    }

    public String theEnd(String str, boolean front) {
        if (front && !str.isEmpty()) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length()-1);
        }
    }
    public String withouEnd2(String str) {
        if (str.length()>=2) {
            return str.substring(1, str.length()-1);
        } else if (str.length() ==1) {
            return str.substring(1);
        } else {
            return str;
        }
    }

    public String middleTwo(String str) {
        int first = str.length()/2;
        return str.substring(first-1, first+1);

    }

    public boolean endsLy(String str) {
//        return str.endsWith("ly");
        if (str.length() >= 2 &&
                str.charAt(str.length() - 2) == 'l' &&
                str.charAt(str.length() - 1) == 'y') {
            return true;
        }
        return false;
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n)+str.substring(str.length()-n);
    }

    public String twoChar(String str, int index) {
        if (index >= 0 && index + 1 < str.length()) {
            return str.substring(index, index+2);
        }
        return str.substring(0, 2);
    }

    public String middleThree(String str) {
        int middle = str.length()/2;
        if (str.length()%2==1 && str.length()>3) {

        } return str.substring(middle-1, middle+2);
    }

    public boolean hasBad(String str) {
        if ((str.length() >= 3 && str.substring(0, 3).equals("bad")) ||
                (str.length() >= 4 && str.substring(1, 4).equals("bad"))) {
            return true;
        }
        return false;
    }

    public String atFirst(String str) {
        if (str.length()>=2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }

    public String lastChars(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) {
            return "@@";
        } else if (!a.isEmpty() && !b.isEmpty()) {
            return a.substring(0, 1) + b.charAt(b.length() - 1);
        } else {
            String first = (a.isEmpty()) ? "@" : a.substring(0, 1);
            String last = (b.isEmpty()) ? "@" : b.substring(b.length() - 1);
            return first + last;
        }
    }

    public String conCat(String a, String b) {
        if (a.isEmpty()) return b;
        if (b.isEmpty()) return a;
        if (a.charAt(a.length()-1)==b.charAt(0)) {
            return a+b.substring(1);
        } else {
            return a+b;
        }
    }

    public String lastTwo(String str) {
        if (str.length()<2) {
            return str;
        } else {
            return str.substring(0, str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2);
        }
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    public boolean frontAgain(String str) {
        if (str.length()>=2 && str.substring(0, 2).equals(str.substring(str.length()-2))) {
            return true;
        }
        return false;
    }

    public String minCat(String a, String b) {
        if (a.length() == b.length()) {
            return a+b;
        } else if (a.length() > b.length()) {
            String trimmedA = a.substring(a.length() - b.length());
            return trimmedA+b;
        } else {
            String trimmedB = b.substring(b.length() - a.length());
            return a+trimmedB;
        }
    }

    public String extraFront(String str) {
        if (str.length()<2) {
            return str+str+str;
        }
        else {
            String newStr = str.substring(0, 2);
            return newStr+newStr+newStr;
        }
    }

    public String without2(String str) {
        if (str.length()>=2 && str.substring(0, 2).equals(str.substring(str.length()-2))) {
            return str.substring(2);
        } else {
            return str;
        }
    }

    public String deFront(String str) {
        StringBuilder result = new StringBuilder();
        if (!str.isEmpty() && str.charAt(0) == 'a') {
            result.append(str.charAt(0));
        }
        if (str.length() >= 2 && str.charAt(1) == 'b') {
            result.append(str.charAt(1));
        }
        if (str.length() > 2) {
            result.append(str.substring(2));
        }

        return result.toString();
    }

    public String withoutX(String str) {
        if (str.isEmpty()) return str;
        if (str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String withoutX2(String str) {
        StringBuilder result = new StringBuilder();
        if (!str.isEmpty() && str.charAt(0) != 'x') {
            result.append(str.charAt(0));
        }
        if (str.length()>=2 && str.charAt(1) !='x') {
            result.append(str.substring(1, 2));
        }
        if (str.length() > 2) {
            result.append(str.substring(2));
        }
        return result.toString();
    }


    public String startWord(String str, String word) {
        if (str.length()<word.length()) {
            return "";
        }
        for (int i=1; i<word.length(); i++) {
            if (str.charAt(i) != word.charAt(i)) {
                return "";
            }
        }
        return str.substring(0, 1) + word.substring(1);
    }

    public boolean parrotTrouble2(boolean talking, int hour) {
        return (talking && (hour<7 || hour>20));

    }

    public boolean loneTeen2(int a, int b) {
        boolean aTeen = (a>=13 && a<=19);
        boolean bTeen = (b>=13 && b<=19);
        return (aTeen && !bTeen || !aTeen && bTeen);
    }









}
