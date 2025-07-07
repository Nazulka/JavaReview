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


}
