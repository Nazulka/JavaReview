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




}
