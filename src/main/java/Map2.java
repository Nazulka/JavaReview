public class Map2 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s:strings) {
            map.put(s, 0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap();

        for (String s:strings) {
            map.put(s, s.length());
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s:strings) {
            String first = String.valueOf(s.charAt(0));
            String last = String.valueOf(s.charAt(s.length() - 1));
            map.put(first, last);
        }
        return map;
    }




}
