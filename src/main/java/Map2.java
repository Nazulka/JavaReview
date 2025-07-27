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

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String s:strings) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String s:strings) {
            String first = String.valueOf(s.charAt(0));
            if (map.containsKey(first)) {
                String last = map.get(first);
                map.put(first, last+s);
            } else {
                map.put(first, s);
            }
        }
        return map;
    }




}
