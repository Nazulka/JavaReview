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

    public String wordAppend(String[] strings) {
        StringBuilder result = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            int count = map.getOrDefault(s, 0);
            // Get current count (default 0)
            count++;
            // Increment count
            map.put(s, count);
            // Save updated count

            if (count % 2 == 0) {
                // If it's the 2nd, 4th, etc time
                result.append(s);
                // Append to result
            }
        }
        return result.toString();
        // Return final result
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();

        for (String s : strings) {
            if (map.containsKey(s)) {
                // We’ve seen this word before — set value to true
                map.put(s, true);
            } else {
                // First time we see this word — set value to false
                map.put(s, false);
            }
        }
        return map;
    }

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            String first = String.valueOf(s.charAt(0));

            if (map.containsKey(first)) {
                int prevIndex = map.get(first);
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;
                map.remove(first);  // remove so future swaps only happen once per char
            } else {
                map.put(first, i);
            }
        }
        return strings;  // <-- Don't forget to return the array!
    }






}
