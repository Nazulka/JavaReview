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



}
